package com.zcz.crm.staff.web.intercepeter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public class LoginIntercepeter extends MethodFilterInterceptor {


    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {

        Object obj = ActionContext.getContext().getSession().get("loginStaff");
        if (obj == null){

            Object action = actionInvocation.getAction();
            if (action instanceof ActionSupport){
                ((ActionSupport) action).addFieldError("","请登录");
            }
            return "login";
        }
        //放行
        return actionInvocation.invoke();
    }
}

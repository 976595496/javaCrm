package com.zcz.crm.staff.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zcz.crm.staff.domain.CrmStaff;
import com.zcz.crm.staff.service.StaffService;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {

    private CrmStaff crmStaff = new CrmStaff();
    @Override
    public CrmStaff getModel() {
        return crmStaff;
    }



    private StaffService staffService;

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }

//-------------------------------------------登录---------------------------------------------

    /**
     * 登录
     * */
    public String login(){
        CrmStaff loginStaff = staffService.login(crmStaff);
        if (loginStaff != null) {
            ActionContext.getContext().getSession().put("loginStaff",loginStaff);
            return SUCCESS;
        }
        this.addFieldError("","用户名或密码输入错误");
        return "login";
    }

    public String home(){
        return "home";
    }

    public String findAll(){
        List<CrmStaff> staffs = staffService.findAll();

        if (staffs.size() <1){
            this.addActionMessage("查询为空");
        }else {
            ActionContext.getContext().put("staffs",staffs);
        }
        return "findAll";
    }

}

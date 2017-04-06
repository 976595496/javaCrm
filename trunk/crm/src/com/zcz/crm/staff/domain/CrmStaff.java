package com.zcz.crm.staff.domain;

import com.zcz.crm.post.domain.CrmPost;

import java.util.Date;

/**
 * Created by zhangchenzhao on 2017/4/5.
 */
public class CrmStaff {


    private String staffId;    //员工ID
    private String loginName;       //登录名
    private String loginPwd;         //登录密码
    private String staffName;       //员工姓名
    private String gender;          //性别
    private Date onDutyDate;      //入职时间
    private CrmPost post;           //员工-----职务    多对一关系


    public CrmStaff() {
    }

    public CrmStaff(String staffId, String loginName, String loginPwd, String staffName, String gender, Date onDutyDate, CrmPost post) {
        this.staffId = staffId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
        this.post = post;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public CrmPost getPost() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }
}

package com.zcz.crm.post.domain;

import com.zcz.crm.department.domain.CrmDepartment;
import com.zcz.crm.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangchenzhao on 2017/4/5.
 */
public class CrmPost {
    private String postId;  //职务ID
    private String postName;    //职务名称;
    private CrmDepartment crmDepartment;        //职务---部门   多对一
    private Set<CrmStaff> staffSet = new HashSet<CrmStaff>();       //职务----员工    一对多

    public CrmPost() {
    }

    public CrmPost(String postId, String postName, CrmDepartment crmDepartment, Set<CrmStaff> staffSet) {
        this.postId = postId;
        this.postName = postName;
        this.crmDepartment = crmDepartment;
        this.staffSet = staffSet;
    }


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public CrmDepartment getCrmDepartment() {
        return crmDepartment;
    }

    public void setCrmDepartment(CrmDepartment crmDepartment) {
        this.crmDepartment = crmDepartment;
    }

    public Set<CrmStaff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<CrmStaff> staffSet) {
        this.staffSet = staffSet;
    }
}

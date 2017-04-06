package com.zcz.crm.department.domain;

import com.zcz.crm.post.domain.CrmPost;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangchenzhao on 2017/4/5.
 */
public class CrmDepartment {
    private String depId;   //部门ID
    private String depName;   //部门名称
    private Set<CrmPost> postSet = new HashSet<CrmPost>();      //部门职务1对多

    public CrmDepartment() {
    }

    public CrmDepartment(String depId, String depName, Set<CrmPost> postSet) {
        this.depId = depId;
        this.depName = depName;
        this.postSet = postSet;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<CrmPost> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<CrmPost> postSet) {
        this.postSet = postSet;
    }
}

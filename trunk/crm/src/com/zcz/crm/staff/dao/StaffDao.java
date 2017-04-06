package com.zcz.crm.staff.dao;

import com.zcz.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public interface StaffDao {
    public CrmStaff find(String loginName, String loginPwd);
    public List<CrmStaff> findAll();
}

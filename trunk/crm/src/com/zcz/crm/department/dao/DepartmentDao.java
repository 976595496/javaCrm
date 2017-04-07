package com.zcz.crm.department.dao;

import com.zcz.crm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public interface DepartmentDao {
    public List<CrmDepartment> findAll();
}

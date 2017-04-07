package com.zcz.crm.department.service;

import com.zcz.crm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public interface DepartmentService {
    public List<CrmDepartment> findAll();
}

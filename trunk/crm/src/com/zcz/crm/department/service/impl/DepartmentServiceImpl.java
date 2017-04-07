package com.zcz.crm.department.service.impl;

import com.zcz.crm.department.dao.DepartmentDao;
import com.zcz.crm.department.domain.CrmDepartment;
import com.zcz.crm.department.service.DepartmentService;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<CrmDepartment> findAll() {
        return departmentDao.findAll();
    }
}

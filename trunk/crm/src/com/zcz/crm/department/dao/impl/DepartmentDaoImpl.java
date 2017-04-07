package com.zcz.crm.department.dao.impl;

import com.zcz.crm.department.domain.CrmDepartment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements com.zcz.crm.department.dao.DepartmentDao {


    @Override
    public List<CrmDepartment> findAll() {
        return this.getHibernateTemplate().find("from CrmDepartment");

    }
}

package com.zcz.crm.staff.dao.impl;

import com.zcz.crm.staff.dao.StaffDao;
import com.zcz.crm.staff.domain.CrmStaff;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {


/**
 * //登录查询
 *  @param loginName
 *  @param loginPwd
 * */
    @Override
    public CrmStaff find(String loginName, String loginPwd) {
        List<CrmStaff> allStaff = this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd = ?", loginName,loginPwd);
        if (allStaff.size()>0){
            return allStaff.get(0);
        }

        return null;
    }


    /**
     * 查询所有员工
     * */
    @Override
    public List<CrmStaff> findAll() {

        List<CrmStaff> staffList = this.getHibernateTemplate().find("from CrmStaff");

        return staffList;
    }
}

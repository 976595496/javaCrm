package com.zcz.crm.post.dao.impl;

import com.zcz.crm.department.domain.CrmDepartment;
import com.zcz.crm.post.dao.PostDao;
import com.zcz.crm.post.domain.CrmPost;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

    @Override
    public List<CrmPost> findAllBydDepartment(CrmDepartment crmDepartment) {
        return this.getHibernateTemplate().find("from CrmPost where crmDepartment=?",crmDepartment);
    }
}

package com.zcz.crm.post.service;

import com.zcz.crm.department.domain.CrmDepartment;
import com.zcz.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public interface PostService {
    public List<CrmPost> findAllBydDepartment(CrmDepartment crmDepartment);
}

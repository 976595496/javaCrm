package com.zcz.crm.post.service.impl;

import com.zcz.crm.department.domain.CrmDepartment;
import com.zcz.crm.post.dao.PostDao;
import com.zcz.crm.post.domain.CrmPost;
import com.zcz.crm.post.service.PostService;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public class PostServiceImpl implements PostService {

    private PostDao postDao ;

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public List<CrmPost> findAllBydDepartment(CrmDepartment crmDepartment) {
        return postDao.findAllBydDepartment(crmDepartment);

    }
}

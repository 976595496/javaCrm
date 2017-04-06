package com.zcz.crm.staff.service;

import com.zcz.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public interface StaffService {
    /**
     * 登录
     * @param crmStaff 登录员工对象
     * */
    public CrmStaff login(CrmStaff crmStaff);

    /**
     * 查询所有员工
     * */
    public List<CrmStaff> findAll();
}

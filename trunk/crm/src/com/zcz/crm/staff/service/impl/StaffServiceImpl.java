package com.zcz.crm.staff.service.impl;

import com.zcz.crm.staff.dao.StaffDao;
import com.zcz.crm.staff.domain.CrmStaff;
import com.zcz.crm.staff.service.StaffService;
import utils.MyStringUtil;

import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }


    /**
     * 登录
     * */
    @Override
    public CrmStaff login(CrmStaff crmStaff) {
        //TODO MD5加密
        String MD5Pwd = MyStringUtil.getMD5String(crmStaff.getLoginPwd());
        return staffDao.find(crmStaff.getLoginName(), MD5Pwd);
    }


    /**
     * 查询所有员工
     * */
    @Override
    public List<CrmStaff> findAll() {
        return staffDao.findAll();

    }
}

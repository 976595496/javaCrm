package com.zcz.crm.classes.domain;

import com.zcz.crm.coursetype.domain.CrmCourseType;

import java.util.Date;

/**
 * Created by zhangchenzhao on 2017/4/5.
 */
public class CrmClasses {
    private String classId;
    private String name;
    private Date beginTime;//
    private Date endTime;//
    private String status;
    private Integer totalCount;
    private Integer upgradeCount;
    private Integer changeCount;
    private Integer runoffCount;
    private String remark;
    private Date uploadTime;//
    private String uploadPath;
    private String uploadFilename;
    private CrmCourseType courseType;

    public CrmClasses() {
    }

    public CrmClasses(String classId, String name, Date beginTime, Date endTime, String status, Integer totalCount, Integer upgradeCount, Integer changeCount, Integer runoffCount, String remark, Date uploadTime, String uploadPath, String uploadFilename, CrmCourseType courseType) {
        this.classId = classId;     //课程ID
        this.name = name;           //课程名称
        this.beginTime = beginTime;     //开班时间
        this.endTime = endTime;         //结业时间

        this.status = status;           //状态
        this.totalCount = totalCount;       //总人数
        this.upgradeCount = upgradeCount;       //升级数
        this.changeCount = changeCount;         //转班数
        this.runoffCount = runoffCount;         //流失
        this.remark = remark;                   //描述

        this.uploadTime = uploadTime;            //上传时间
        this.uploadPath = uploadPath;               //上传课表路径
        this.uploadFilename = uploadFilename;       //上传课表名称
        this.courseType = courseType;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUpgradeCount() {
        return upgradeCount;
    }

    public void setUpgradeCount(Integer upgradeCount) {
        this.upgradeCount = upgradeCount;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public Integer getRunoffCount() {
        return runoffCount;
    }

    public void setRunoffCount(Integer runoffCount) {
        this.runoffCount = runoffCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadFilename() {
        return uploadFilename;
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }

    public CrmCourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CrmCourseType courseType) {
        this.courseType = courseType;
    }
}

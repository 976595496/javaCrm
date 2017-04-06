package com.zcz.crm.coursetype.domain;

import com.zcz.crm.classes.domain.CrmClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangchenzhao on 2017/4/5.
 */
public class CrmCourseType {

    private String courseTypeId;  //课程Id
    private Double courseCost;      //费用
    private Integer total;          //总学时
    private String courseName;       //课程类别名称
    private String remark;          //描述description
    private Set<CrmClasses> classesSet = new HashSet<CrmClasses>();

    public CrmCourseType() {
    }

    public CrmCourseType(String courseTypeId, Double courseCost, Integer total, String courseName, String remark, Set<CrmClasses> classesSet) {
        this.courseTypeId = courseTypeId;
        this.courseCost = courseCost;
        this.total = total;
        this.courseName = courseName;
        this.remark = remark;
        this.classesSet = classesSet;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<CrmClasses> getClassesSet() {
        return classesSet;
    }

    public void setClassesSet(Set<CrmClasses> classesSet) {
        this.classesSet = classesSet;
    }
}

package com.exam.exam_assess_demo.service;

import com.exam.assess.pojo.Dept;
import com.exam.assess.pojo.PageBean;

public interface DeptService {

    //新增部门
    void insertDept(Dept dept);

    void updateDept(Dept dept);

    void deleteDept(int id);

    //根据条件查询部门
    PageBean getDepts(Dept dept,Integer page, Integer pageSize);
}

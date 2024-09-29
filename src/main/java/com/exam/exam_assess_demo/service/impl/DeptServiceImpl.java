package com.exam.exam_assess_demo.service.impl;


import com.exam.exam_assess_demo.mapper.DeptMapper;
import com.exam.exam_assess_demo.pojo.Dept;
import com.exam.exam_assess_demo.pojo.PageBean;
import com.exam.exam_assess_demo.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private final DeptMapper deptMapper;
    public DeptServiceImpl(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public void insertDept(Dept dept) {
        deptMapper.insertDept(dept);
    }

    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }

    @Override
    public void deleteDept(int id) {
        deptMapper.deleteDept(id);
    }

    //分页条件查询
    @Override
    public PageBean getDepts(Dept dept, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Dept> depts = deptMapper.selectDept(dept);
        PageInfo<Dept> pageInfo = new PageInfo<>(depts);
        PageBean pageBean = new PageBean(pageInfo.getTotal(),pageInfo.getList());
        return pageBean;
    }
}

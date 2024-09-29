package com.exam.exam_assess_demo.controller;

import com.exam.assess.pojo.Dept;
import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.Result;
import com.exam.assess.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    //部门增删改查

    //添加部门
    @PostMapping
    Result addDept(@RequestParam Dept dept) {
        deptService.insertDept(dept);
        return Result.success();
    }

    //查询部门数据
    @GetMapping
    Result getAllDept(Dept dept,Integer page,Integer rows) {
        PageBean depts = deptService.getDepts(dept, page, rows);
        return Result.success(depts);
    }

    //更新部门数据(传递)
    @PutMapping
    Result updateDept(@RequestParam Dept dept) {
        deptService.updateDept(dept);
        return Result.success();
    }



}

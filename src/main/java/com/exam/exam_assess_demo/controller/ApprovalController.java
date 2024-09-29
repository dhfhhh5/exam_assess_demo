package com.exam.exam_assess_demo.controller;


import com.exam.exam_assess_demo.pojo.Approval;
import com.exam.exam_assess_demo.pojo.PageBean;
import com.exam.exam_assess_demo.pojo.Result;
import com.exam.exam_assess_demo.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/approval")
public class ApprovalController {
    @Autowired
    ApprovalService approvalService;

    //新增审批
    @PostMapping
    public Result  insertApproval(Approval approval){
        approvalService.insert(approval);
        return Result.success();
    }

    //修改审批
    @PutMapping
    public Result updateApproval(Approval approval){
        approvalService.update(approval);
        return Result.success();
    }

    //根据条件分页查询审批
    @GetMapping
    public Result deleteApproval(Approval approval,Integer page, Integer pageSize){
        PageBean pageBean = approvalService.page(approval, page, pageSize);
        return Result.success(pageBean);
    }

    //多表联查获取请假与审批信息.
    @GetMapping("/list")
    public Result getList(Integer id,Integer page, Integer pageSize,Integer type,Integer userId){
        PageBean pageBean = approvalService.approvalList(id, type, userId, page, pageSize);
        System.out.println(pageBean);
        return Result.success(pageBean);
    }
}

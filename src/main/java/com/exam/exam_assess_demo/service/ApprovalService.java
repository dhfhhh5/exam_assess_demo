package com.exam.exam_assess_demo.service;


import com.exam.exam_assess_demo.pojo.Approval;
import com.exam.exam_assess_demo.pojo.PageBean;

public interface ApprovalService {
    //根据条件分页查询
    PageBean page(Approval approval, Integer page, Integer pageSize);

    //插入
    void insert(Approval approval);

    //修改
    void update(Approval approval);

    //查询列表
    PageBean approvalList(Integer id,Integer type,Integer userId,Integer page,Integer pageSize);
}

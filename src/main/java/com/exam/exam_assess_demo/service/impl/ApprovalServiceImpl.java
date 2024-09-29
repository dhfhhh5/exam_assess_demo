package com.exam.exam_assess_demo.service.impl;

import com.exam.assess.mapper.ApprovalMapper;
import com.exam.assess.pojo.Approval;
import com.exam.assess.pojo.ApprovalVacation;
import com.exam.assess.pojo.PageBean;
import com.exam.assess.service.ApprovalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalServiceImpl implements ApprovalService {

    @Autowired
    private ApprovalMapper approvalMapper;


    @Override
    public PageBean page(Approval approval, Integer page, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        //执行查询操作
        List<Approval> approvalList = approvalMapper.selectApproval(approval);
        PageInfo<Approval> pageInfo = new PageInfo<>(approvalList);
        PageBean pageBean = new PageBean(pageInfo.getTotal(),pageInfo.getList());
        return pageBean;
    }

    @Override
    public void insert(Approval approval) {
        approvalMapper.insertApproval(approval);
    }

    @Override
    public void update(Approval approval) {
        System.out.println(approval);
        approvalMapper.updateApproval(approval);
    }

    @Override
    public PageBean approvalList(Integer id,Integer type, Integer userId, Integer page, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        //执行查询操作
        List<ApprovalVacation> approvalList = approvalMapper.list(id, type, userId);
        PageInfo<ApprovalVacation> pageInfo = new PageInfo<>(approvalList);
        PageBean pageBean = new PageBean(pageInfo.getTotal(),pageInfo.getList());
        return pageBean;
    }

}

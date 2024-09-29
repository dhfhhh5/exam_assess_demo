package com.exam.exam_assess_demo.mapper;


import com.exam.exam_assess_demo.pojo.Approval;
import com.exam.exam_assess_demo.pojo.ApprovalVacation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 管理假期申请表
 */
@Mapper
public interface ApprovalMapper {

    //新增假期申请
    void insertApproval(@Param("approval") Approval approval);

    //修改假期申请
    void updateApproval(@Param("approval")Approval approval);

    //获取根据条件查询假期申请
    List<Approval> selectApproval(@Param("approval")Approval approval);

    //分页查询列表,根据假期类型,请假人id,
    List<ApprovalVacation> list(Integer id, Integer type, Integer userId);
}

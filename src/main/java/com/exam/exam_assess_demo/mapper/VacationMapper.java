package com.exam.exam_assess_demo.mapper;


import com.exam.exam_assess_demo.pojo.Vacation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 *
 */
@Mapper
public interface VacationMapper {
    //新增假期
    void insertVacation(@Param("vacation") Vacation vacation);

    //修改假期
    void updateVacation(@Param("vacation")Vacation vacation);

    //根据条件查询假期
    List<Vacation> selectVacation(@Param("vacation")Vacation vacation);

    //根据员工id查询假期
    @Select("")
    Vacation selectVacationByUserId(int userId);

}

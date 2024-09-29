package com.exam.exam_assess_demo.mapper;

import com.exam.assess.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 对部门表的操作
 */
@Mapper
public interface DeptMapper {
    //新增部门
    @Insert("insert into dept (dept_name) VALUES (#{dept.deptName})")
    void insertDept(Dept dept);

    //修改部门信息
    @Update("update dept set dept_name=#{dept.deptName} where id = #{dept.id}")
    void updateDept(Dept dept);

    //逻辑删除部门(暂时不提供）
    void deleteDept(int id);

    //根据条件分页查询部门
    List<Dept> selectDept(@Param("dept") Dept dept);

}

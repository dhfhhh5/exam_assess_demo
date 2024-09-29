package com.exam.exam_assess_demo.mapper;

import com.exam.assess.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有人员，权限大于等于2（人事之上）
    @Select("select * from user")
    List<User> findAll();

    //新增员工
    void insert(User user);

    //删除员工
    @Delete("delete from user where id = #{id}")
    void delete(int id);

    //修改员工
    @Update("update user set username=#{user.name} where id=#{user.id}")
    void update(User user);
}

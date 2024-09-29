package com.exam.exam_assess_demo.service;

import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.User;

public interface UserService {

    //新增员工
    void addUser(User user);

    //更新员工
    void updateUser(User user);

    //分页查询所有员工
    PageBean page(Integer page, Integer pageSize);

    //逻辑删除员工
    void deleteUser(Integer id);
}

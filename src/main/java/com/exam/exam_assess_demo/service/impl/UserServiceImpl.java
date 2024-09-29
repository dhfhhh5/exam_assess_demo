package com.exam.exam_assess_demo.service.impl;

import com.exam.assess.mapper.UserMapper;
import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.User;
import com.exam.assess.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }


    /**
     * 分页查询所有员工
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean page(Integer page, Integer pageSize) {
        //1.设置分页参数
        PageHelper.startPage(page, pageSize);
        //2.执行条件查询操作
        List<User> userList = userMapper.findAll();
        Page<User> p = (Page<User>) userList;
        //PageInfo<Emp> p = new PageInfo<>(empList);
        //3.封装PageBean对象
        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());
        //PageBean pageBean = new PageBean(p.getTotal(),p.getList());
        return pageBean;
    }

    @Override
    public void deleteUser(Integer id) {
    }

    //分页查询所有数据

}

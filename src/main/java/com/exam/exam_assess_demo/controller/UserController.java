package com.exam.exam_assess_demo.controller;


import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.Result;
import com.exam.assess.pojo.User;
import com.exam.assess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入service对象
    @Autowired
    private UserService userService;

    //新增员工
    @PostMapping()
    public Result addUser(@RequestBody User user) {
        userService.addUser(user);
        return Result.success();
    }

    //分页查询所有员工
    @GetMapping()
    public Result selectAllUser(Integer page, Integer pageSize){
        PageBean userList = userService.page(page, pageSize);
        return Result.success(userList);
    }

    //更新员工信息
    @PutMapping()
    public Result updateUser(User user) {
        userService.updateUser(user);
        return Result.success("更新员工成功");
    }
}

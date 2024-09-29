package com.exam.exam_assess_demo.exception;

import com.exam.assess.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 这是一个全局异常处理器
 */
@RestControllerAdvice
//这个注解的作用是声明他是一个异常处理器,用于处理@RestController注解的方法中出现的异常
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    //这个注解是捕获的异常种类,当发生的异常与捕获的异常相匹配时,就会进入这个函数进行异常处理
    //全局异常处理类是为了统一处理后端在处理数据时发生的异常,
    public Result exception(Exception e) {
        e.printStackTrace();
        return Result.error("操作失败,联系管理员");
    }

}

package com.exam.exam_assess_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 分页查询结果的封装类
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {

    //查询结果的总数
    private Long total;
    //查询结果
    private List rows;
}
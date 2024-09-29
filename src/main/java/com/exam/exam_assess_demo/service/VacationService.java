package com.exam.exam_assess_demo.service;

import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.Vacation;

public interface VacationService {
    //新增请假
    void addVacation(Vacation vacation);

    //更新假期
    void updateVacation(Vacation vacation);

    //查询根据不同条件分页假期分页查询
    PageBean selectVacation(Vacation vacation, Integer page, Integer pageSize);
}

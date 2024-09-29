package com.exam.exam_assess_demo.service.impl;

import com.exam.assess.mapper.VacationMapper;
import com.exam.assess.pojo.PageBean;
import com.exam.assess.pojo.Vacation;
import com.exam.assess.service.VacationService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationServiceImpl implements VacationService {

    //注入mapper方法
    @Autowired
    private VacationMapper vacationMapper;

    @Override
    public void addVacation(Vacation vacation) {
        vacationMapper.insertVacation(vacation);
    }

    @Override
    public void updateVacation(Vacation vacation) {
        vacationMapper.updateVacation(vacation);
    }

    @Override
    public PageBean selectVacation(Vacation vacation, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);

        List<Vacation> vacationList = vacationMapper.selectVacation(vacation);
        Page<Vacation> p = (Page<Vacation>) vacationList;

        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());

        return pageBean;


    }
}

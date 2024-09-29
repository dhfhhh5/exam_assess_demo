package com.exam.exam_assess_demo.controller;


import com.exam.exam_assess_demo.pojo.PageBean;
import com.exam.exam_assess_demo.pojo.Result;
import com.exam.exam_assess_demo.pojo.Vacation;
import com.exam.exam_assess_demo.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vacation")
public class VacationController {
    //注入service
    @Autowired
    private VacationService vacationService;

    //新增请假
    @PostMapping
    public Result addVacation(@RequestBody Vacation vacation) {
        //请假状态默认为0（未审批）
        vacation.setStatus(0);
        vacationService.addVacation(vacation);
        return Result.success("请假申请成功,等待审批中");
    }

    //修改请假
    @PutMapping
    public Result updateVacation(@RequestBody Vacation vacation) {
        if (vacation.getStatus() == 0) {
            vacationService.updateVacation(vacation);
        }else {
            return Result.error("该请假已被审批,无法修改.可以再次提交请假申请");
        }

        return Result.success("修改请假信息成功");
    }

    //查询请假
    @GetMapping
    public Result getAllVacation(Vacation vacation, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageBean vacationList =  vacationService.selectVacation(vacation, page, size);
        return Result.success(vacationList);
    }

    //删除请假信息
    @DeleteMapping()
    public Result deleteVacation(Vacation vacation) {
        //状态为3是已被删除（逻辑删除）
        vacation.setStatus(3);
        vacationService.updateVacation(vacation);
        return Result.success();
    }

}

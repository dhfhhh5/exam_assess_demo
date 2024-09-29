package com.exam.exam_assess_demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalVacation {
    private Integer id;
    private Integer vacationId;
    private Integer userId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime approvalTime;
    private String opinion;

    //包含假期对象
    private Vacation vacation;

}

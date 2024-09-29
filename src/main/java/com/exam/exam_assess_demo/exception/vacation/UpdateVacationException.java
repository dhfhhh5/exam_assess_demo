package com.exam.exam_assess_demo.exception.vacation;

/**
 * 这是修改假期出现的异常
 */
public class UpdateVacationException extends RuntimeException {
    public UpdateVacationException(String message) {
        super(message);
    }
}

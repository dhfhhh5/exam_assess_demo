package com.exam.exam_assess_demo.exception.vacation;

/**
 * 这是新增假期请求时出现的异常
 */
public class AddVacationException extends RuntimeException {
    public AddVacationException(String message) {
        super(message);
    }
}

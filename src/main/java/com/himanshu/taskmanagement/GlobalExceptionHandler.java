package com.himanshu.taskmanagement;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleInvalidArgument(
            IllegalArgumentException exception) {

        return new ApiError(exception.getMessage());
    }

    @ExceptionHandler(DuplicateTaskException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ApiError handleDuplicateTask(DuplicateTaskException exception) {
        return new ApiError(exception.getMessage());
    }

    @ExceptionHandler(TaskNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleTaskNotFound(TaskNotFoundException exception) {
        return new ApiError(exception.getMessage());
    }
}
package com.himanshu.taskmanagement;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(int id) {
        super("Task not found with id: " + id);
    }
}
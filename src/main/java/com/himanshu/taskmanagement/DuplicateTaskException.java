package com.himanshu.taskmanagement;

public class DuplicateTaskException extends RuntimeException {

    public DuplicateTaskException(int id) {
        super("Task ID already exists: " + id);
    }
}
package com.himanshu.taskmanagement;
// This DTO defines the error response body:
/*
{
  "message": "Task title cannot be empty"
} 
  */
public record ApiError(String message) {
    
}

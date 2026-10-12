package com.himanshu.taskmanagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "Task management API is running";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from springboot";
    }
    
}

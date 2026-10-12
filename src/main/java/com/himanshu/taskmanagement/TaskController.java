package com.himanshu.taskmanagement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/tasks/incomplete")
    public List<Task> getIncompleteList() {
        return service.getIncompleteTasks();
    }

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody CreateTaskRequest request) {
        service.addTask(request.id(), request.title());

        return service.findTaskbyId(request.id());

    }

    @GetMapping("/tasks/{id}")
    public Task getTaskbyId(@PathVariable("id") int id) {
        return service.findTaskbyId(id);
    }

    @PatchMapping("/tasks/{id}/complete")
    public Task completeTask(@PathVariable("id") int id) {
        service.completeTask(id);

        return service.findTaskbyId(id);
    }

    @DeleteMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") int id) {
        // TODO: Call the service's deleteTask method.
        service.deleteTask(id);
    }

}

package com.himanshu.taskmanagement;
import java.util.List;
public interface TaskRepository {

    void save(Task task);
    boolean existsById(int id);
    Task findById(int id);
    List<Task> findAll();
    void deleteById(int id);
}

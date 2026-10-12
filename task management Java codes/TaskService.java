import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(int id, String title) {
        if (repository.existsById(id)) {
            throw new IllegalArgumentException("Id alrady present in repository: " + id);
        }

        repository.save(new Task(id, title));
    }

    public Task findTaskbyId(int id) {
        return repository.findById(id);
    }

    public void completeTask(int id) {
        Task task = repository.findById(id);

        if (!task.isCompleted()) {
            task.markedCompleted();
        }
    }

    public List<Task> getIncompleteTasks() {
        List<Task> result = new ArrayList<>();

        for (Task task : repository.findAll()) {
            if (!task.isCompleted()) {
                result.add(task);
            }
        }

        return result;
    }

}

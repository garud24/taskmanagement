import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository{

    private final List<Task> tasks = new ArrayList<>();

    @Override 
    public void save(Task task) {
        tasks.add(task);
    }

    @Override 
    public boolean existsById(int id)
    {
        for (Task task: tasks)
        {
            if (task.getId() == id){
                return true;
            }
        }

        return false;
    }
    @Override 
    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

        throw new IllegalArgumentException("Task not found with id: " + id);
    }

    @Override
    public List<Task> findAll()
    {
        List<Task> result = new ArrayList<>();

        for (Task task : tasks)
        {
            result.add(task);
        }

        return result;
    }
}
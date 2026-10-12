
public class Main {

    public static void main(String[] args) {
        TaskRepository repository = new InMemoryTaskRepository();
        TaskService service = new TaskService(repository);

        service.addTask(1, "Learn interfaces");
        service.addTask(2, "Learn dependency injection");

        service.completeTask(1);
        service.completeTask(1);

        System.out.println(
                "Task 1 completed: " + repository.findById(1).isCompleted());

        // get incomplete tasks
        for (Task task : service.getIncompleteTasks()) {
            System.out.println(task.getTitle());
        }

        try {
            service.addTask(2, "Duplicate task");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        // A missing task should produce a handled error.
        try {
            service.completeTask(99);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

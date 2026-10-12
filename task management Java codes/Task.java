public class Task {
    private int id;
    private String title;
    private boolean completed = false;

    public Task(int id, String title)
    {
        if ( id <= 0)
        {
            throw new IllegalArgumentException("Id must be positive");
        }
        this.id = id;
        if (title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public boolean isCompleted()
    {
        return completed;
    }

    public void markedCompleted()
    {
        completed = true;
    }
}

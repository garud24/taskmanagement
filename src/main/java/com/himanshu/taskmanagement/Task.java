package com.himanshu.taskmanagement;

public class Task {

    int id;
    String title;
    boolean completed = false;

    public Task(int id, String title)
    {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        if ( title.isBlank() || title == null)
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }

        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

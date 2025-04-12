package main.java.com.ejemplo.Mongodb.model;

import org.bson.types.Objectid:

public class Task {
    private ObjectId id;
    private String title;
    private boolean completed;
}
    public Task() {}

    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
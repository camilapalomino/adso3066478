package main.java.com.ejemplo.Mongodb.dao;

import com.ejemplo.mongodb.model.Task;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import main.java.com.ejemplo.Mongodb.MongoDBConnection;

import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class taskDAO {
    private MongoCollection<Task> collection;

    public TaskDAO() {
        MongoDatabase database = MongoDBConnection.getDatabase();
        collection = database.getCollection("tasks", Task.class);
    }

    public void createTask(Task task) {
        collection.insertOne(task);
    }

    public Task readTask(ObjectId id) {
        return collection.find(eq("_id", id)).first();
    }
    
    public void updateTask(Task task) {
        collection.replaceOne(eq("_id", task.getId()), task);
    }

    public void deleteTask(ObjectId id) {
        collection.deleteOne(eq("_id", id));
    }
}
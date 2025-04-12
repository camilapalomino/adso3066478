package com.ejemplo.mongodb.dao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static MongoDatabase getDatabase() {
    if (database == null) {

    String connectionString = "mongodb://localhost:27017";
    mongoClient = MongoClients.create(connectionString);
    database = mongoClient.getDatabase("taskdb");       
    }
    return database;
}
public static void close() {
  if (mongoClient != null) {
        mongoClient.close();
        }
    }
}
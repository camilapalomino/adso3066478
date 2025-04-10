#ifndef MONGODBCONNECTION_H
#define MONGODBCONNECTION_H
#include <mongocxx/client.hpp>
#include <mongocxx/instance.hpp>
#include <mongocxx/uri.hpp>

class MongoDBConnection {
    private:
    mongocxx::instance instance{}; // Inicializa el driver
    mongocxx::client client{mongocxx::uri{"mongodb://localhost:27017"}};
    mongocxx::database database;

public:
    MongoDBConnection() : database(client["taskdb"]) {}

    mongocxx::database getDatabase() {
        return database;
    }
};

#endif



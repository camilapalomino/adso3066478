#include <iostream>
#include <bsoncxx/json.hpp>
#include <mongocxx/client.hpp>
#include <mongocxx/instance.hpp>
#include <mongocxx/pool.hpp>

int main() {
    mongocxx::instance inst{};
    
    try {
        mongocxx::client conn{mongocxx::uri{"mongodb://localhost:27017"}};

        std::cout << "Conexión exitosa" << std::endl;
        std::cout << "Tipo de conexión: " << typeid(conn).name() << std::endl;

        std::cout << "Bases de datos disponibles:" << std::endl;
        for (const auto& db_name : conn.list_databases()) {
            std::cout << db_name["name"].get_utf8().value.to_string() << std::endl;
        }

    } catch (const std::exception& e) {
        std::cerr << "Error al conectar a MongoDB: " << e.what() << std::endl;
    }

    return 0;
}

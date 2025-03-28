// g++ -o postgres_connection postgres_connection.cpp -lpq// 

#include <iostream>
#include <libpq-fe.h>

int main() {
    const char* conninfo = "host=localhost user=postgres password=1234 dbname=postgres port=5432";

    PGconn* conn = PQconnectdb(conninfo);

    if (PQstatus(conn) == CONNECTION_OK) {
        std::cout << "Conexión exitosa" << std::endl;
        std::cout << "Detalles de la conexión: " << conn << std::endl;
    } else {
        std::cerr << "Conexión fallida: " << PQerrorMessage(conn) << std::endl;
    }

    PQfinish(conn);

    return 0;
}

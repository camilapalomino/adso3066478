#include <iostream>
#include <mysql_driver.h>
#include <mysql_connection.h>
#include <cppconn/prepared_statement.h>
#include <cppconn/resultset.h>

int main() {
    try {
        sql::mysql::MySQL_Driver *driver;
        sql::Connection *con;

        driver = sql::mysql::get_mysql_driver_instance();
        
        con = driver->connect("tcp://127.0.0.1:3306", "root", "");

        std::cout << "Conexion exitosa" << std::endl;

        delete con;
    } catch (sql::SQLException &e) {
        std::cerr << "Error al conectar a la base de datos: " << e.what() << std::endl;
        return 1;
    }

    return 0;
}

// instalar go get -u github.com/go-sql-driver/mysql //

package main

import (
	"database/sql"
	"fmt"
	"log"
)

func main() {
	dsn := "root:@tcp(localhost:3306)/"
	db, err := sql.Open("mysql", dsn)
	if err != nil {
		log.Fatal(err)
	}
	defer db.Close()

	err = db.Ping()
	if err != nil {
		log.Fatal(err)
	}

	fmt.Println("Conexión exitosa")
}

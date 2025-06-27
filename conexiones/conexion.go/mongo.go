// go get go.mongodb.org/mongo-driver/mongo//

package main

// go.mongodb.org/mongo-driver/mongo: Este es el controlador oficial de MongoDB para Go. //

import (
	"context"
	"fmt"
	"log"

	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
)

func main() {
	// Crear un contexto
	ctx := context.Background()

	// Conectar al cliente MongoDB
	clientOptions := options.Client().ApplyURI("mongodb://localhost:27017/")
	client, err := mongo.Connect(ctx, clientOptions)
	if err != nil {
		log.Fatal("Error al conectar a MongoDB:", err)
	}
	defer client.Disconnect(ctx)

	// Verificar la conexión
	err = client.Ping(ctx, nil)
	if err != nil {
		log.Fatal("Error al hacer ping a MongoDB:", err)
	}
	fmt.Println("Conexión exitosa")

	// Imprimir el tipo de conexión
	fmt.Printf("Tipo de conexión: %T\n", client)

	// Listar las bases de datos disponibles
	databases, err := client.ListDatabaseNames(ctx, nil)
	if err != nil {
		log.Fatal("Error al listar bases de datos:", err)
	}
	fmt.Println("Bases de datos disponibles:", databases)
}

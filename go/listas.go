package main

import "fmt"

func main() {
	// Declaración de la lista de strings
	Lista := []string{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"}

	// Imprimir el valor del índice 4 (recordar que los índices en Go empiezan en 0)
	fmt.Println(Lista[4])

	// Imprimir toda la lista
	fmt.Println(Lista)

	// Imprimir una sublista del índice 0 al 2 (inclusive, pero sin incluir el 3)
	fmt.Println(Lista[0:3])

	// Crear una lista que incluye otros tipos de datos
	ListaMixta := []interface{}{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", 1, 2, 3, []interface{}{"Esteban", 0.2, 2.25, true}}

	// Imprimir una sublista de los primeros 4 elementos y acceder a la sublista dentro de la lista mixta
	fmt.Println(ListaMixta[0:4], ListaMixta[9].([]interface{})[0:3])
}

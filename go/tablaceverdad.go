package main

import "fmt"

func main() {
	// Asignación de valores booleanos
	a := true
	b := false

	// Operación lógica AND
	fmt.Println(a && b)

	// Asignación de valores numéricos
	//:= para declarar e inicializar variables de manera implícita en un bloque de código//

	a := 2
	b := 3
	c := 4
	d := 10

	// Comparación con AND
	fmt.Println(a == b && c < d)

	// Comparación con NOT y AND
	fmt.Println(!(a == b) && c > d)
}

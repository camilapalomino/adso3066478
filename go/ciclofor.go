package main

import (
	"fmt"
	"math"
)

func main() {
	var A, C int

	// Pedir el primer valor
	fmt.Print("Ingrese el primer valor: ")
	fmt.Scan(&A)

	// Pedir el segundo valor
	fmt.Print("Ingrese el segundo valor: ")
	fmt.Scan(&C)

	// Calcular la potencia
	valor := math.Pow(float64(A), float64(C))

	// Imprimir el resultado
	fmt.Printf("La potencia de %d sobre %d es: %.0f\n", A, C, valor)
}

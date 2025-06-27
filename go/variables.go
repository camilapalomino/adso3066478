package main

import (
	"fmt"
	"math"
)

func main() {
	// Declarar las variables a y b
	a := 10
	b := 4

	// Multiplicación
	c := a * b
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: *")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)

	// División
	c = a / b
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: /")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)

	// Suma
	c = a + b
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: +")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)

	// Resta
	c = a - b
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: -")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)

	// Exponenciación (potencia) - En Go se utiliza el paquete `math` para la exponenciación.
	c = int(math.Pow(float64(a), float64(b)))
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: **")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)

	// Módulo
	c = a % b
	fmt.Println("La primera variable es:", a)
	fmt.Println("El signo de la operación es: %")
	fmt.Println("La segunda variable es:", b)
	fmt.Println("El resultado es:", c)
	fmt.Printf("Tipo del resultado: %T\n", c)
}

package main

import (
	"fmt"
)

func main() {
	var Figura string
	const Pi = 3.1416
	const constante = 2

	// Selección de la figura
	fmt.Print("Seleccione la figura a calcular su área:\n\n 1 para rombo\n\n 2 para rectángulo\n\n 3 para cuadrado\n\n 4 para trapecio\n\n: ")
	fmt.Scan(&Figura)

	// Condiciones para calcular el área dependiendo de la figura seleccionada
	switch Figura {
	case "1":
		// Rombo
		var Dmayor, Dmenor int
		fmt.Print("Ingresa el valor de la diagonal mayor: ")
		fmt.Scan(&Dmayor)
		fmt.Print("Ingresa el valor de la diagonal menor: ")
		fmt.Scan(&Dmenor)
		Area := float64(Dmayor+Dmenor) / float64(constante)
		fmt.Printf("El área del rombo es: %.2f\n", Area)

	case "2":
		// Rectángulo
		var Largo, Ancho int
		fmt.Print("Ingresa el valor del largo del rectángulo: ")
		fmt.Scan(&Largo)
		fmt.Print("Ingresa el valor del ancho del rectángulo: ")
		fmt.Scan(&Ancho)
		Area := float64(Largo * Ancho)
		fmt.Printf("El área del rectángulo es: %.2f\n", Area)

	case "3":
		// Cuadrado
		var Lado int
		fmt.Print("Ingresa el valor del lado del cuadrado: ")
		fmt.Scan(&Lado)
		Area := float64(Lado * Lado)
		fmt.Printf("El área del cuadrado es: %.2f\n", Area)

	case "4":
		// Trapecio
		var Bmayor, Bmenor, H int
		fmt.Print("Ingresa el valor de la base mayor: ")
		fmt.Scan(&Bmayor)
		fmt.Print("Ingresa el valor de la base menor: ")
		fmt.Scan(&Bmenor)
		fmt.Print("Ingresa la altura del trapecio: ")
		fmt.Scan(&H)
		Area := float64((Bmayor+Bmenor)*H) / 2
		fmt.Printf("El área del trapecio es: %.2f\n", Area)

	default:
		// En caso de no seleccionar ninguna opción válida, calculamos un área circular
		var A float64
		A = Pi
		fmt.Printf("El área del círculo es: %.2f\n", A)
	}
}

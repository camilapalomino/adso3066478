package main

import (
	"fmt"
	"time"
)

func main() {
	// Variables para almacenar la entrada del usuario
	var a, b, c string
	var d int

	// Solicitar al usuario que ingrese sus datos
	fmt.Print("Escriba sus nombres completos: ")
	fmt.Scanln(&a)

	fmt.Print("Escriba sus apellidos completos: ")
	fmt.Scanln(&b)

	fmt.Print("Escriba su profesion: ")
	fmt.Scanln(&c)

	fmt.Print("Escriba su año de nacimiento: ")
	fmt.Scanln(&d)

	// Calcular la edad
	year := time.Now().Year()
	edad := year - d

	// Imprimir el resultado
	fmt.Printf("El (La) %s %s %s tiene %d años\n", c, a, b, edad)
}

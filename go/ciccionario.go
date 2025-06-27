package main

import "fmt"

func main() {
	// Crear un mapa (equivalente al diccionario en Python)
	coche := map[string]string{
		"marca":  "Ford",
		"color":  "rojo",
		"modelo": "sedan",
		"placa":  "PQS123",
	}

	// Imprimir el valor de 'color'
	fmt.Println("Color del coche:", coche["color"])

	// Modificar el valor de 'color'
	coche["color"] = "verde"
	fmt.Println("Nuevo color del coche:", coche["color"])

	// Imprimir el valor de 'marca'
	fmt.Println("Marca del coche:", coche["marca"])

	// Modificar el valor de 'marca'
	coche["marca"] = "Renault"
	fmt.Println("Nueva marca del coche:", coche["marca"])

	// Imprimir todo el mapa
	fmt.Println("Información del coche:")
	for key, value := range coche {
		fmt.Println(key+":", value)
	}
}

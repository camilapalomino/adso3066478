package main

import (
	"fmt"
	"log"
)

func main() {
	// Declaración de variables
	var Voltaje, Resistencia int

	// Solicitar al usuario que ingrese los valores de voltaje y resistencia
	fmt.Print("Ingrese el valor del voltaje del circuito: ")
	_, err := fmt.Scan(&Voltaje)
	if err != nil {
		log.Fatal("Error al leer el voltaje:", err)
	}

	fmt.Print("Ingrese el valor de la resistencia del circuito: ")
	_, err = fmt.Scan(&Resistencia)
	if err != nil {
		log.Fatal("Error al leer la resistencia:", err)
	}

	// Verificar si la resistencia es cero para evitar la división por cero
	if Resistencia == 0 {
		log.Fatal("La resistencia no puede ser cero")
	}

	// Calcular la intensidad de corriente utilizando la ley de Ohm (I = V / R)
	Intensidad := float64(Voltaje) / float64(Resistencia)

	// Imprimir el resultado
	fmt.Printf("Al conectar un resistor de R %d ohm a una fuente de V %d voltios, circulará una corriente de %.2f amperios\n", Resistencia, Voltaje, Intensidad)
}

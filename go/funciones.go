package main

import "fmt"

// Funciones
// Mostrar texto
func mostrarTexto() {
	fmt.Println("hola")
}

// Función multiplicar con valores internos
func multiplicar() {
	a := 5
	b := 8
	fmt.Println(a * b)
}

// Función multiplicar que usa variables globales
var a = 5
var b = 8

func multiplicarGlobal() {
	fmt.Println(a * b)
}

// Función multiplicar que devuelve un valor
func multiplicarReturn() int {
	a := 5
	b := 8
	return a * b
}

// Función para validar un dato
func validarDato() bool {
	if a == 5 {
		return true
	}
	return false
}

func main() {
	// Parte 1: Trabajar con listas (slice en Go)
	a := []int{1, 2, 3, 4, 5}
	b := []int{6, 7, 8, 9, 10}
	var c []int

	for i := 0; i < len(a); i++ {
		c = append(c, a[i]*b[i])
	}
	fmt.Println(c) // Imprime el resultado de multiplicar los elementos

	// Llamar a las funciones
	mostrarTexto()

	multiplicar()

	multiplicarGlobal()

	// Función que devuelve un valor
	resultado := multiplicarReturn()
	fmt.Println(resultado + 5)

	// Validación de un dato
	dato := validarDato()
	fmt.Println(dato)
}

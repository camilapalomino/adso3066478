package main

import "fmt"

func main() {
	// Declaración de variables
	var A, B int

	// Solicitar al usuario que ingrese dos valores enteros
	fmt.Print("Ingrese valor: ")
	_, err := fmt.Scan(&A)
	if err != nil {
		fmt.Println("Error al leer el valor de A:", err)
		return
	}

	fmt.Print("Ingrese valor: ")
	_, err = fmt.Scan(&B)
	if err != nil {
		fmt.Println("Error al leer el valor de B:", err)
		return
	}

	// Realizar la suma
	suma := A + B
	fmt.Println("La suma de los números es:", suma)

	// Realizar la resta
	res := A - B
	fmt.Println("La resta de los números es:", res)

	// Realizar la multiplicación
	multi := A * B
	fmt.Println("La multiplicación de los números es:", multi)

	// Realizar la división
	// Verificamos que no se divida por cero
	if B != 0 {
		div := float64(A) / float64(B)
		fmt.Println("La división de los números es:", div)
	} else {
		fmt.Println("Error: No se puede dividir entre cero")
	}

	// Comprobar si A es igual a B
	igual := A == B
	fmt.Println("El número es igual:", igual)

	// Comparar si A es mayor que B
	if A > B {
		fmt.Println("El número mayor es:", A)
		fmt.Println("El número menor es:", B)
	} else {
		fmt.Println("El número mayor es:", B)
		fmt.Println("El número menor es:", A)
	}
}

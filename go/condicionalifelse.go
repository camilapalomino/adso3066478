package main

import "fmt"

func main() {
	a := 2
	if a == 2 {
		fmt.Println("a vale 2")
	} else {
		fmt.Println("a es diferente de 2")
	}

	Nombre := "Luis"
	Edad := "28"
	Pais := "Colombia"

	if Nombre == "luis" && Edad == 28 && Pais == "Colombia" {
		fmt.Printf("Su nombre es %s, tiene %d años y es de %s\n", Nombre, Edad, Pais)
	} else if Nombre == "luis" && Edad != 28 {
		fmt.Println("Su nombre es luis y no tiene 28 años")
	} else if Nombre != "luis" && Edad == 28 {
		fmt.Println("Su nombre no es luis y tiene 28 años")
	} else {
		fmt.Println("No se llama luis ni tiene 28 años")
	}
}

package main
import "fmt"

func main() {
	contador := 0
	for contador < 30{
		contador++ 
		fmt.Fprintln("iteración", contador)
	}
}

//fmt.Scanln(&a) para leer un valor introducido por el usuario desde la consola//
var a int 
	for {
	fmt.Fprintln("Introduzca un valor mayor a 10:")
	fmt.Scanln(&a)
	if a > 10 {
		fmt.Fprintln ("es correcto")
		break
	} else {
		fmt.Println ("es correcto, pruebe de nuevo")
	}
	}

package main

import (
	"fmt"
)

type Usuario struct {
	nombre string
	pin    int
	saldo  float64
}

type Banco struct {
	usuarios []Usuario
}

func (b *Banco) autenticar(nombre string, pin int) bool {
	for _, usuario := range b.usuarios {
		if usuario.nombre == nombre {
			if usuario.pin == pin {
				fmt.Println("Estás logeado")
				return true
			} else {
				fmt.Println("Pin o nombre incorrecto")
				return false
			}
		}
	}
	fmt.Println("El usuario no existe")
	return false
}

func (b *Banco) sacarDinero(nombre string, cantidad float64) {
	for i, usuario := range b.usuarios {
		if usuario.nombre == nombre {
			if usuario.saldo < cantidad {
				fmt.Println("Saldo insuficiente")
				return
			}
			b.usuarios[i].saldo -= cantidad
			fmt.Printf("El saldo disponible es %.2f\n", b.usuarios[i].saldo)
			return
		}
	}
}

func main() {
	// Crear usuarios
	ana := Usuario{"Ana", 9872, 450}
	pablo := Usuario{"Pablo", 5555, 200}
	rodrigo := Usuario{"Rodrigo", 2222, 900}

	// Crear banco con usuarios
	banco := Banco{usuarios: []Usuario{ana, pablo, rodrigo}}

	// Ciclo principal para la interacción con el usuario
	for {
		var nombre string
		var pin int
		fmt.Println("Bienvenido al Banco, por favor, identifíquese.")
		fmt.Print("Introduzca el nombre: ")
		fmt.Scanln(&nombre)
		fmt.Print("Introduzca el pin: ")
		fmt.Scanln(&pin)

		if banco.autenticar(nombre, pin) {
			for {
				var opcion string
				fmt.Println("Por favor, elija una de estas opciones:")
				fmt.Println("1. Sacar dinero")
				fmt.Println("2. Terminar sesión")
				fmt.Print("Elija opción: ")
				fmt.Scanln(&opcion)

				if opcion == "1" {
					var saldo float64
					fmt.Print("Introduce cantidad a sacar: ")
					fmt.Scanln(&saldo)
					banco.sacarDinero(nombre, saldo)
				} else if opcion == "2" {
					fmt.Println("Saliendo del sistema.")
					break
				} else {
					fmt.Println("Opción incorrecta. Por favor, introduzca otra opción.")
				}
			}
		} else {
			fmt.Println("Usuario no autenticado. Por favor, introduzca nombre y pin correctos.")
		}
	}
}

class Usuario {
    constructor(nombre, pin, saldo) {
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }
}

class Banco {
    constructor(usuarios = []) {
        this.usuarios = usuarios;
    }

    autenticar(nombre, pin) {
        for (let usuario of this.usuarios) {
            if (usuario.nombre === nombre) {
                if (usuario.pin === pin) {
                    console.log("Estas Logeado");
                    return true;
                } else {
                    console.log("Pin o nombre incorrecto");
                    return false;
                }
            }
        }
        console.log("El usuario no existe");
        return false;
    }

    sacar_dinero(nombre, saldo) {
        for (let usuario of this.usuarios) {
            if (usuario.nombre === nombre) {
                if (usuario.saldo < saldo) {
                    console.log("Saldo insuficiente");
                    break;
                } else if (usuario.saldo >= saldo) {
                    usuario.saldo -= saldo;
                    console.log("El saldo disponible es " + usuario.saldo);
                }
            }
        }
    }
}

// Crear usuarios
let ana = new Usuario('Ana', 9872, 450);
let pablo = new Usuario('Pablo', 5555, 200);
let rodrigo = new Usuario('Rodrigo', 2222, 900);

// Crear banco con usuarios
let banco = new Banco([ana, pablo, rodrigo]);

function iniciarSesion() {
    let nombre = prompt("Bienvenido al Banco, por favor, identifiquese.\nIntroduzca el nombre: ");
    let pin = parseInt(prompt("Introduzca el pin: "), 10);

    if (banco.autenticar(nombre, pin)) {
        while (true) {
            let opcion = prompt("Por favor, elija una de estas opciones:\n 1. Sacar dinero\n 2. Terminar sesión.\n");

            if (opcion === '1') {
                let monto = parseInt(prompt("Introduce cantidad a sacar: "), 10);
                banco.sacar_dinero(nombre, monto);
            } else if (opcion === '2') {
                console.log("Saliendo del sistema.");
                break;
            } else {
                console.log("Opción incorrecta. Por favor, introduzca otra opción.");
            }
        }
    } else {
        console.log("Usuario no autenticado. Por favor, Introduzca nombre y pin correctos.");
    }
}

iniciarSesion();

import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    int pin;
    double saldo;

    // Constructor para inicializar los datos del usuario
    public Usuario(String nombre, int pin, double saldo) {
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }
}

class Banco {
    ArrayList<Usuario> usuarios;

    // Constructor para inicializar la lista de usuarios
    public Banco(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Método para autenticar al usuario
    public boolean autenticar(String nombre, int pin) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre.equals(nombre)) {
                if (usuario.pin == pin) {
                    System.out.println("Estas Logeado");
                    return true;
                } else {
                    System.out.println("Pin o nombre incorrecto");
                    return false;
                }
            }
        }
        System.out.println("El usuario no existe");
        return false;
    }

    // Método para permitir al usuario retirar dinero
    public void sacarDinero(String nombre, double monto) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre.equals(nombre)) {
                if (usuario.saldo < monto) {
                    System.out.println("Saldo insuficiente");
                    break;
                } else {
                    usuario.saldo -= monto;
                    System.out.println("El saldo disponible es " + usuario.saldo);
                }
            }
        }
    }
}

//Main Gestiona la interacción con el usuario mediante la consola, autenticando al usuario//

public class Main {
    public static void main(String[] args) {
        // Crear algunos usuarios
        Usuario ana = new Usuario("Ana", 9872, 450);
        Usuario pablo = new Usuario("Pablo", 5555, 200);
        Usuario rodrigo = new Usuario("Rodrigo", 2222, 900);

        // Crear la lista de usuarios y el banco
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(ana);
        usuarios.add(pablo);
        usuarios.add(rodrigo);
        Banco banco = new Banco(usuarios);

        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Banco, por favor, identifiquese.");
            System.out.print("Introduzca el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduzca el pin: ");
            int pin = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            // Intentar autenticar al usuario
            if (banco.autenticar(nombre, pin)) {
                while (true) {
                    System.out.println("Por favor, elija una de estas opciones:");
                    System.out.println("1. Sacar dinero");
                    System.out.println("2. Terminar sesión.");
                    System.out.print("Opción: ");
                    String opcion = scanner.nextLine();

                    if (opcion.equals("1")) {
                        System.out.print("Introduce cantidad a sacar: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine();  // Consumir el salto de línea
                        banco.sacarDinero(nombre, monto);

                    } else if (opcion.equals("2")) {
                        System.out.println("Saliendo del sistema.");
                        break;
                    } else {
                        System.out.println("Opción incorrecta. Por favor, introduzca otra opción.");
                    }
                }
            } else {
                System.out.println("Usuario no autenticado. Por favor, introduzca nombre y pin correctos.");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primer bucle: Contador de 1 a 30
        //System.out.println("Iteración " + contador);: Se imprime el valor de contador en la consola cada vez que se ejecuta el bucle//
        int contador = 0;
        while (contador < 30) {
            contador += 1;
            System.out.println("Iteración " + contador);
        }

        // Segundo bucle: Solicitar un valor mayor a 10
        //Scanner scanner = new Scanner(System.in); poder leer datos introducidos por el usuario a través de la consola//
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un valor mayor a 10");
            int a = scanner.nextInt();  // Leer la entrada del usuario

            if (a > 10) {
                System.out.println("Es correcto");
            } else {
                System.out.println("Es incorrecto, pruebe de nuevo");
                break;  // Sale del bucle si el valor es incorrecto
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}

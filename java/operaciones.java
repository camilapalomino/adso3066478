import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para tomar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los valores de A y B
        System.out.print("Ingrese valor para A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese valor para B: ");
        int B = scanner.nextInt();

        // Realizar las operaciones matemáticas
        int suma = A + B;
        System.out.println("La suma de los números es: " + suma);

        int res = A - B;
        System.out.println("La resta de los números es: " + res);

        int multi = A * B;
        System.out.println("La multiplicación de los números es: " + multi);

        // Para evitar división por cero, comprobamos si B es 0
        if (B != 0) {
            double div = (double) A / B;
            System.out.println("La división de los números es: " + div);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Comparar si A es igual a B
        boolean igual = (A == B);
        System.out.println("¿A es igual a B? " + igual);

        // Comparar si A es mayor o menor que B
        boolean mayor = (A > B);
        System.out.println("¿A es mayor que B? " + mayor);

        boolean menor = (A < B);
        System.out.println("¿A es menor que B? " + menor);
    }
}

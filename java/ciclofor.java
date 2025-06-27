import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el primer valor
        System.out.print("Ingrese el primer valor: ");
        int A = scanner.nextInt();
        
        int B = 0;

        // Solicitar el segundo valor
        System.out.print("Ingrese el segundo valor: ");
        int C = scanner.nextInt();

        // Calcular la potencia
        int valor = (int) Math.pow(A, C); 
        System.out.println("La potencia de " + A + " sobre " + C + " es: " + valor);

        scanner.close();
    }
}

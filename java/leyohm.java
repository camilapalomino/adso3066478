import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el voltaje
        System.out.print("Ingrese el valor del voltaje del circuito: ");
        int voltaje = scanner.nextInt();
        
        // Solicitar y leer la resistencia
        System.out.print("Ingrese el valor de la resistencia del circuito: ");
        int resistencia = scanner.nextInt();

        // Calcular la intensidad usando la ley de Ohm: Intensidad = Voltaje / Resistencia
        double intensidad = (double) voltaje / resistencia;
        
        // Imprimir el resultado
        System.out.println("Al conectar un resistor de R " + resistencia + " ohm a una fuente de V " + voltaje + " voltios, circulará una corriente de " + intensidad + " amperios.");

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la figura a calcular su área: ");
        System.out.println("1 para rombo");
        System.out.println("2 para rectángulo");
        System.out.println("3 para cuadrado");
        System.out.println("4 para trapecio");
        System.out.print(": ");
        int figura = scanner.nextInt();
        
        double Pi = 3.1416;
        int constValue = 2;
        
        switch (figura) {
            case 1: // Rombo
                System.out.print("Ingresa el valor de la diagonal mayor: ");
                int Dmayor = scanner.nextInt();
                System.out.print("Ingresa el valor de la diagonal menor: ");
                int Dmenor = scanner.nextInt();
                double areaRombo = (Dmayor * Dmenor) / constValue;
                System.out.println("El área del rombo es: " + areaRombo);
                break;
                
            case 2: // Rectángulo
                System.out.print("Ingresa el valor del largo del rectángulo: ");
                int Largo = scanner.nextInt();
                System.out.print("Ingresa el valor del ancho del rectángulo: ");
                int Ancho = scanner.nextInt();
                double areaRectangulo = Largo * Ancho;
                System.out.println("El área del rectángulo es: " + areaRectangulo);
                break;
                
            case 3: // Cuadrado
                System.out.print("Ingresa el valor del lado del cuadrado: ");
                int Lado = scanner.nextInt();
                double areaCuadrado = Lado * Lado;
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;
                
            case 4: // Trapecio
                System.out.print("Ingresa el valor de la base mayor: ");
                int Bmayor = scanner.nextInt();
                System.out.print("Ingresa el valor de la base menor: ");
                int Bmenor = scanner.nextInt();
                System.out.print("Ingresa la altura del trapecio: ");
                int H = scanner.nextInt();
                double areaTrapecio = ((Bmayor + Bmenor) * H) / 2.0;
                System.out.println("El área del trapecio es: " + areaTrapecio);
                break;
                
            default:
                System.out.println("Selección no válida.");
                break;
        }
        
        scanner.close();
    }
}

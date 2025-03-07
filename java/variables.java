public class Operaciones {
    public static void main(String[] args) {
        // Definimos las variables a y b
        int a = 10;
        int b = 4;

        // Multiplicación
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: * ");
        System.out.println("La segunda variable es: " + b);
        int c = a * b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // División
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: / ");
        System.out.println("La segunda variable es: " + b);
        c = a / b; // División entera en Java
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Suma
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: + ");
        System.out.println("La segunda variable es: " + b);
        c = a + b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Resta
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: - ");
        System.out.println("La segunda variable es: " + b);
        c = a - b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Exponentiación (se usa Math.pow para elevar a la potencia)
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: ** ");
        System.out.println("La segunda variable es: " + b);
        double d = Math.pow(a, b); 
        System.out.println("El resultado es: " + d);
        System.out.println("Tipo de d: " + ((Object)d).getClass().getName());

        // potencia 
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: % ");
        System.out.println("La segunda variable es: " + b);
        c = a % b; 
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());
    }
}

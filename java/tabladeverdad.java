public class OperacionesLogicas {
    public static void main(String[] args) {
        // Declara las variables booleanas
        boolean a = true;
        boolean b = false;

        // Realiza la operación lógica AND
        System.out.println(a && b); // Imprime false porque a es true y b es false

        // Declara las variables enteras
        int x = 2;
        int y = 3;
        int z = 4;
        int w = 10;

        // Realiza las comparaciones lógicas y las imprime
        System.out.println((x == y) && (z < w)); // Imprime false porque x != y y z < w

        System.out.println(!(x == y) && (z > w)); // Imprime false porque x != y pero z no es mayor que w
    }
}

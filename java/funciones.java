import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicia de los arreglos a y b
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        
        // Crear una lista para almacenar los resultados
        //Integer envuelve un valor de tipo int en un objeto, lo que permite almacenar este valor en colecciones como listas//
        List<Integer> c = new ArrayList<>();
        
        // Bucle for para multiplicar los elementos correspondientes de los arreglos a y b
        for (int i = 0; i < a.length; i++) {
            c.add(a[i] * b[i]);
        }
        
        // Imprimir el resultado
        System.out.println(c);
        
        // Llamada a la función mostrarTexto
        mostrarTexto();
        
        // Llamada a la función multiplicar sin parámetros
        multiplicar();
        
        // Llamada a la función multiplicar con variables globales
        int aValue = 5;
        int bValue = 8;
        multiplicar(aValue, bValue);
        
        // Llamada a la función multiplicar con retorno y operación adicional
        int resultado = multiplicar();
        System.out.println(resultado + 5);
        
        // Llamada a la función validarDato
        boolean datoValido = validarDato(aValue);
        System.out.println(datoValido);
    }

    // Función para mostrar un texto
    public static void mostrarTexto() {
        System.out.println("hola");
    }

    // Función multiplicar sin parámetros (solo imprime)
    public static void multiplicar() {
        int a = 5;
        int b = 8;
        System.out.println(a * b);
    }

    // Función multiplicar con parámetros
    public static void multiplicar(int a, int b) {
        System.out.println(a * b);
    }

    // Función multiplicar con retorno
    public static int multiplicar() {
        int a = 5;
        int b = 8;
        return a * b;
    }

    // Función para validar un dato
    public static boolean validarDato(int a) {
        if (a == 5) {
            return true;
        } else {
            return false;
        }
    }
}

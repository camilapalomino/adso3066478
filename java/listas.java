import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear y llenar una lista de días de la semana
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miércoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sábado");

        // Imprimir el quinto elemento de la lista (índice 4)
        System.out.println(lista.get(4));  // Imprime: Viernes

        // Imprimir toda la lista
        System.out.println(lista);  // Imprime: [Lunes, Martes, Miércoles, Jueves, Viernes, Sábado]

        // Imprimir los primeros 3 elementos de la lista
        System.out.println(lista.subList(0, 3));  // Imprime: [Lunes, Martes, Miércoles]

        // Crear una lista mixta con diferentes tipos de datos
        ArrayList<Object> listaMixta = new ArrayList<>();
        listaMixta.add("Lunes");
        listaMixta.add("Martes");
        listaMixta.add("Miércoles");
        listaMixta.add("Jueves");
        listaMixta.add("Viernes");
        listaMixta.add("Sábado");
        listaMixta.add(1);
        listaMixta.add(2);
        listaMixta.add(3);
        
        // Crear una sublista que contiene un objeto con varios elementos
        ArrayList<Object> detallesEsteban = new ArrayList<>();
        detallesEsteban.add("Esteban");
        detallesEsteban.add(0.2);
        detallesEsteban.add(2.25);
        detallesEsteban.add(true);
        
        listaMixta.add(detallesEsteban);

        // Imprimir los primeros 4 elementos de la lista y el primer elemento de la sublista dentro de listaMixta
        System.out.println(listaMixta.subList(0, 4));  // Imprime: [Lunes, Martes, Miércoles, Jueves]
        System.out.println(((ArrayList<Object>) listaMixta.get(9)).subList(0, 3));  // Imprime: [Esteban, 0.2, 2.25]
    }
}

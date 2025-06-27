import java.util.HashMap;
import java.util.Map;

public class Coche {
    public static void main(String[] args) {
        // Crear un mapa para almacenar las propiedades del coche
        //la clase HashMap de la biblioteca estándar (java.util) para simular el comportamiento de un diccionario//
        Map<String, String> coche = new HashMap<>();
        
        // Agregar los valores al mapa 
        //put(key, value) para agregar elementos al Map//
        coche.put("marca", "Ford");
        coche.put("color", "rojo");
        coche.put("modelo", "sedan");
        coche.put("placa", "PQS123");

        // Imprimir el color del coche
        //get(key) para obtener el valor asociado a una clave en el Map//
        System.out.println(coche.get("color"));

        // Cambiar el color del coche a "verde"
        coche.put("color", "verde");

        // Imprimir el nuevo color del coche
        System.out.println(coche.get("color"));

        // Imprimir la marca del coche
        System.out.println(coche.get("marca"));

        // Cambiar la marca del coche a "Renault"
        coche.put("marca", "Renault");

        // Imprimir la nueva marca del coche
        System.out.println(coche.get("marca"));

        // Imprimir el mapa completo (equivalente a imprimir todo el diccionario)
        System.out.println(coche);
    }
}

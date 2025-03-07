import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Primer ejemplo: imprimir los nombres
        String[] nombres = {"camila", "yury", "cristian", "sebastian"};

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Segundo ejemplo: imprimir nombres y edades de personas
        //HashMap es una implementación de la interfaz Map, que almacena elementos en pares de clave-valor//
        ArrayList<HashMap<String, Object>> personas = new ArrayList<>();

        // Creando los objetos persona
        //put() se utiliza para agregar un nuevo par clave-valor al HashMap//
        HashMap<String, Object> a = new HashMap<>();
        a.put("nombre", "camila");
        a.put("Edad", 22);

        HashMap<String, Object> b = new HashMap<>();
        b.put("nombre", "yury");
        b.put("Edad", 28);

        HashMap<String, Object> c = new HashMap<>();
        c.put("nombre", "cristian");
        c.put("Edad", 31);

        HashMap<String, Object> d = new HashMap<>();
        d.put("nombre", "sebastian");
        d.put("Edad", 26);

        // Añadiendo las personas a la lista
        personas.add(a);
        personas.add(b);
        personas.add(c);
        personas.add(d);

        // Imprimiendo nombre y edad de cada persona
        for (HashMap<String, Object> persona : personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }
    }
}

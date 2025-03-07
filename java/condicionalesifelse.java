public class Main {
    public static void main(String[] args) {
        // Primer bloque de código (condicional simple)
        int a = 2;
        
        if (a == 2) {
            System.out.println("a vale 2");
        } else {
            System.out.println("a es diferente de 2");
        }

        // Segundo bloque de código condicional con múltiples condiciones
        //El método .equals() en Java se utiliza para comparar el valor de cadenas (strings), ya que el operador == no funciona para comparar contenido en cadenas//
        String nombre = "luis";
        int edad = 28;
        String pais = "Colombia";

        if (nombre.equals("luis") && edad == 28 && pais.equals("Colombia")) {
            System.out.println("Su nombre es " + nombre + ", tiene " + edad + " y es de " + pais);
        } else if (nombre.equals("luis") && edad != 28) {
            System.out.println("Su nombre es luis y no tiene 28 años");
        } else if (!nombre.equals("luis") && edad == 28) {
            System.out.println("Su nombre no es luis y tiene 28 años");
        } else {
            System.out.println("No se llama luis ni tiene 28 años");
        }
    }
}

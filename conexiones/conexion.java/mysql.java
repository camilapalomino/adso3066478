import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public static void main(String[] args) {
        // Definir los parámetros de conexión
        String url = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String contraseña = "";
       
        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            
            // Imprimir la conexión
            System.out.println(conn);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            // Si ocurre un error, se muestra el mensaje de error
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}

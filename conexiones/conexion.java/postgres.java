import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPostgres {
    public static void main(String[] args) {
        // Definir los parámetros de conexión
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String contraseña = "1234";
        
        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa: " + conn);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}

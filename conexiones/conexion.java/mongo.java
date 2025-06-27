import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class ConexionMongoDB {
    public static void main(String[] args) {

        String uri = "mongodb://localhost:27017/";
        
        MongoClient cliente = new MongoClient(new MongoClientURI(uri));
        
        // Imprimir el cliente de conexión y el tipo de conexión
        System.out.println(cliente);
        System.out.println("Conexión exitosa");
        System.out.println("Tipo de conexión: " + cliente.getClass().getName());
        
        // Listar las bases de datos disponibles
        System.out.println("Bases de datos disponibles:");
        for (String dbName : cliente.listDatabaseNames()) {
            System.out.println(dbName);
        }

        // Cerrar la conexión
        cliente.close();
    }
}

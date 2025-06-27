//el primer paso es instalar npm install mongodb//
// Importamos el paquete mongodb
const { MongoClient } = require('mongodb');

// URI de conexión a MongoDB
const uri = "mongodb://localhost:27017/";

// Conexión a MongoDB
async function conectarMongoDB() {
    try {
        // Crear cliente y conectar a MongoDB
        const cliente = new MongoClient(uri);
        await cliente.connect();

        console.log(cliente);
        console.log("Conexión exitosa");

        console.log(`Tipo de conexión: ${cliente.constructor.name}`);

        const basesDeDatos = await cliente.db().admin().listDatabases();
        console.log("Bases de datos disponibles:", basesDeDatos.databases);

        // Cerrar la conexión
        await cliente.close();
    } catch (error) {
        console.error("Error al conectar a MongoDB:", error);
    }
}

conectarMongoDB();

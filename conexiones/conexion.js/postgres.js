// instalar npm install pg desde terminal//

const { Client } = require('pg');

const config = {
    host: 'localhost',
    user: 'postgres',
    password: '1234',
    database: 'postgres',
    port: 5432
};

const client = new Client(config);

//conectar y verificar si la conexión fue exitosa
client.connect()
    .then(() => {
        console.log(client);
        console.log("Conexión exitosa");
    })
    .catch((err) => {
        console.error('Error de conexión:', err.stack);
    })
    .finally(() => {
        // Cerramos la conexión después de usarla
        client.end();
    });

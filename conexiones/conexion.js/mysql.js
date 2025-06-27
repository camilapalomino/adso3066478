//el primer paso es instalar mysql2 con el comando npm install mysql2//
// Importamos el paquete mysql2
const mysql = require('mysql2');

// Creamos la conexión a la base de datos
const conn = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'comercio'
});

// Intentamos conectar y verificamos si la conexión fue exitosa
conn.connect((err) => {
    if (err) {
        console.error('Error de conexión: ' + err.stack);
        return;
    }
    console.log('Conexión exitosa');
});
conn.end();



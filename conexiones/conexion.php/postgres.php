<?php
$host = "localhost";
$port = 5432;
$dbname = "postgres";
$user = "postgres";
$password = "1234";

// Crear la cadena de conexión
$conn_str = "host=$host port=$port dbname=$dbname user=$user password=$password";

// Intentar conectar a la base de datos
$conn = pg_connect($conn_str);

// Comprobar si la conexión fue exitosa
if ($conn) {
    echo "Conexión exitosa";
} else {
    echo "Error en la conexión";
}

// Mostrar la conexión (solo para depuración)
var_dump($conn);
?>

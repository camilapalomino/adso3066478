<?php
$host = "localhost";
$user = "root";
$password = "";

// Crear la conexión a MySQL
$conn = new mysqli($host, $user, $password);

// Comprobar si la conexión fue exitosa
if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
} else {
    echo "Conexión exitosa\n";
}

var_dump($conn);

// Cerrar la conexión
$conn->close();
?>

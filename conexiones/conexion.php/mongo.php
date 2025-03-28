<?php
require 'vendor/autoload.php';

// Crear la conexión a MongoDB
$cliente = new MongoDB\Client("mongodb://localhost:27017");

// Imprimir la conexión y verificar si está exitosa
echo "Conexión exitosa\n";

// Imprimir el tipo de objeto de la conexión
echo "Tipo de conexión: " . get_class($cliente) . "\n";

// Listar las bases de datos disponibles
echo "Bases de datos disponibles: \n";
$dbs = $cliente->listDatabases();
foreach ($dbs as $db) {
    echo $db->getName() . "\n";
}
?>

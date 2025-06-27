<?php 

function saludar ($nombre) {
    return "¡hola, " . $nombre . "!";
}

function sumar ($a, $b) {
    return $a + $b;
}

$num1 = 5;
$num2 = 3; 
$resultado_suma = sumar ($num1, $num2);
echo "la suma de $num1 y $num2 es: $resultado_suma"; 
?>
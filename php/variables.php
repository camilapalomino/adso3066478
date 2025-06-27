<?php

$a = 8;
$b = 2;

// Multiplicación
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: * ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = $a * $b;
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";

// División
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: / ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = $a / $b;
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";

// Suma
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: + ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = $a + $b;
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";

// Resta
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: - ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = $a - $b;
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";

// Exponente (potencia)
// en vez de ** como en python se usa pow()
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: ** ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = pow($a, $b); 
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";

// Módulo (resto de la división)
//El operador % en PHP se utiliza para obtener el resto de una división.
echo 'La primera variable es: ' . $a . "\n";
echo 'El signo de la operación es: % ' . "\n";
echo 'La segunda variable es: ' . $b . "\n";
$c = $a % $b;  
echo 'El resultado es: ' . $c . "\n";
echo 'Tipo de la variable: ' . gettype($c) . "\n";
?>

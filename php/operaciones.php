<?php

$A = (int)readline('Ingrese valor: ');

$B = (int)readline('Ingrese valor: ');

$suma = $A + $B;
echo 'La suma de los numeros es: ' . $suma . "\n";

$res = $A - $B;
echo 'La resta de los numeros es: ' . $res . "\n";

$multi = $A * $B;
echo 'La multiplicación de los numeros es: ' . $multi . "\n";

if ($B != 0) { // Verificar que no se divida entre 0
    $div = $A / $B;
    echo 'La división de los numeros es: ' . $div . "\n";
} else {
    echo 'No se puede dividir entre cero' . "\n";
}

$igual = ($A == $B);
echo 'El número ' . ($igual ? 'es' : 'no es') . ' igual: ' . $A . "\n";

if ($A > $B) {
    echo 'El número menor es: ' . $B . "\n";
    echo 'El número mayor es: ' . $A . "\n";
} elseif ($A < $B) {
    echo 'El número menor es: ' . $A . "\n";
    echo 'El número mayor es: ' . $B . "\n";
} else {
    echo 'Los dos números son iguales' . "\n";
}
?>

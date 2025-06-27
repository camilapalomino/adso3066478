<?php

echo "ingrese el primer valor:" ;
$A = intval (fgets(STDIN));
$B = 0;
echo "ingrese el segundo valor: ";
$C = intval(fgets(STDIN));

$valor = pow($A, $C);

echo "la potencia de $A sobre $C es: $valor\n";
?>

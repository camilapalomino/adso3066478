<?php

$coche = array(
    'marca' => 'Ford',
    'color' => 'rojo',
    'modelo' => 'sedan',
    'placa' => 'PQS123'
);


echo $coche['color'] . "\n";


$coche['color'] = 'verde';
echo $coche['color'] . "\n";


echo $coche['marca'] . "\n";


$coche['marca'] = 'Renault';
echo $coche['marca'] . "\n";


print_r($coche);
?>
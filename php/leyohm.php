<?php

$Voltaje = (int)readline('Ingrese el valor del voltaje del circuito: ');

$Resistencia = (int)readline('Ingrese el valor de la resistencia del circuito: ');

// Calcular la intensidad usando la ley de Ohm (I = V / R)
$Intensidad = $Voltaje / $Resistencia;

echo 'Al conectar un resistor de R ' . $Resistencia . ' ohm\' a una fuente de V ' . $Voltaje . ' voltios circulará una corriente de ' . $Intensidad . ' amperios' . "\n";
?>

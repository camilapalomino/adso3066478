<?php
//readline se usa para obtener la entrada del usuario desde la consola//
$a = readline('Escriba sus nombres completos: ');

$b = readline('Escriba sus Apellidos completos: ');

$c = readline('Escriba su profesion: ');

$d = readline('Escriba su año de nacimiento: ');
// (int)$d se usa para segurar que el año de nacimiento sea un numero entero//
$e = 2025 - (int)$d;

echo 'El (La) ' . $c . ' ' . $a . ' ' . $b . ' tiene ' . $e . ' años' . "\n";
?>

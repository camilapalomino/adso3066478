<?php
// variables booleanas 
$a = true;
$b = false;
// && equivale al operador logico AND 
echo ($a && $b) ? 'true' : 'false';  
echo "\n";

$a = 2;
$b = 3;
$c = 4;
$d = 10;

echo (($a == $b) && ($c < $d)) ? 'true' : 'false';
echo "\n";
// ! significa not 
echo (!(($a == $b)) && ($c > $d)) ? 'true' : 'false';
echo "\n";
?>

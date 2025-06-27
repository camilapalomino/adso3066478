<?php
$nombres = ['camila', 'yury', 'cristian','sebastian \n\n'];

foreach ($nombres as $nombre) {
    echo $nombre . "\n";
}

$personas = [];

$a = ['nombre' => 'camila' , 'edad' => 22];
$b = ['nombre' => 'yury' , 'edad' => 28];
$c = ['nombre' => 'cristian' , 'edad' => 31];
$d = ['nombre' => 'sebastian' , 'edad' => 26];

array_push ($personas, $a, $b, $c, $d);

foreach ($personas as $persona) {
    echo $persona['nombre']. " " . $persona['edad'] . "\n";
}
?>


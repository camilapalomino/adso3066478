<?php 

$contador = 0;
while ($contador <30) {
    $contador++;
    echo "iteracion" . $contador . "\n";
}

while (true) {
    echo "intrduzca un valor mayor a 10: "; 
    $a = intval (fgets(STDIN));
    if ($a > 10) {
        echo "Es correcto\n"; 
    }else {
        echo "es incorrecto, pruebe un nuero nuevo\n";
        break;
    }
}
?>

// para leer la entrada del usuario se usa fgets(STDIN) y para conevertirla a entero se usa intval//
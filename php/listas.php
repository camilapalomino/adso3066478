<?php
// lista de días de la semana //
$Lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado'];

// Mostrar el día en la posición 4 (índice 4 corresponde a 'viernes')
//para acceder a un indice especifico de un arreglo se usa la anotacion $Lista[index//
echo $Lista[4] . "\n";

// definir la lista y mostrarla completa
// para imprimir un arreglo completo use usa print_r() //
$Lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado'];
print_r($Lista);

// Mostrar un subarreglo de la lista (desde el índice 0 hasta el 2, excluyendo el 3)
// para mostrar un subarreglo se usa array_slice()//
$Lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado'];
echo implode(", ", array_slice($Lista, 0, 3)) . "\n";

// Definir una lista con diferentes tipos de elementos
$Lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado', 1, 2, 3, ['Esteban', 0.2, 2.25, true]];

// Mostrar un subarreglo desde el índice 0 al 4 y acceder a un subarreglo dentro del último elemento
echo implode(", ", array_slice($Lista, 0, 4)) . ", " . implode(", ", array_slice($Lista[9], 0, 3)) . "\n";
?>

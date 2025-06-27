// Lista de días de la semana//
//acceder a los elementos de un arreglo usando la notación Lista[index]//
let Lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado'];

// Mostrar el día en la posición 4 (índice 4 corresponde a 'viernes')//
//imprimir la lista console.log//
console.log(Lista[4]);

// Mostrar la lista completa
console.log(Lista);

// Mostrar un subarreglo de la lista (desde el índice 0 hasta el 2, excluyendo el 3)
//slice() en JavaScript para obtener una sección del arreglo.//
//join(", ") para unir un arreglo//
let subLista = Lista.slice(0, 3);
console.log(subLista.join(", "));

// Definir una lista con diferentes tipos de elementos
let ListaMixta = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'viernes', 'sabado', 1, 2, 3, ['Esteban', 0.2, 2.25, true]];

// Mostrar un subarreglo desde el índice 0 al 4 y acceder a un subarreglo dentro del último elemento
let subListaMixta = ListaMixta.slice(0, 4).join(", ");
let subSubLista = ListaMixta[9].slice(0, 3).join(", ");
console.log(`${subListaMixta}, ${subSubLista}`);

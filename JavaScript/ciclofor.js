// Pedir los valores al usuario//
//se usa prompt() para pedir al usuario que ingrese los valores A y C//
const A = parseInt(prompt("Ingrese el primer valor:"));
const C = parseInt(prompt("Ingrese el segundo valor:"));

// Calcular la potencia//
//Math.pow(A, C) calcula la potencia de A elevado a C//
const valor = Math.pow(A, C);

// Mostrar el resultado//
//alert para mostrar el resultad0//
alert(`La potencia de ${A} sobre ${C} es: ${valor}`);

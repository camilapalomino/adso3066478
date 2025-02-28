// Función para realizar la operación matemática
function calcular(num1, num2, operacion) {
    let resultado = 0;

    switch (operacion) {
        case 'suma':
            resultado = num1 + num2;
            break;
        case 'resta':
            resultado = num1 - num2;
            break;
        case 'multiplicacion':
            resultado = num1 * num2;
            break;
        case 'division':
            if (num2 !== 0) {
                resultado = num1 / num2;
            } else {
                resultado = "Error: División por cero";
            }
            break;
        default:
            resultado = "Operación no válida";
            break;
    }

    return resultado;
}

// Ejemplo //
const num1 = 10;
const num2 = 5;
const operacion = 'suma'; 

const resultado = calcular(num1, num2, operacion);
console.log("Resultado: " + resultado);

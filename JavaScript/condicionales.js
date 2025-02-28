const Pi = 3.1416;
const constValue = 2;

const readlineSync = require('readline-sync'); // Para leer la entrada del usuario//

// Solicitar la figura a calcular//
console.log("Seleccione la figura a calcular su área:");
console.log("1 para rombo");
console.log("2 para rectángulo");
console.log("3 para cuadrado");
console.log("4 para trapecio");

let figura = readlineSync.question('Elige una opción (1, 2, 3, 4): ');

switch (figura) {
    case '1':
        let Dmayor = parseInt(readlineSync.question("Ingresa el valor de la diagonal mayor: "));
        let Dmenor = parseInt(readlineSync.question("Ingresa el valor de la diagonal menor: "));
        let areaRombo = (Dmayor * Dmenor) / constValue;
        console.log(`El área del rombo es: ${areaRombo}`);
        break;

    case '2':
        let largo = parseInt(readlineSync.question("Ingresa el valor del largo del rectángulo: "));
        let ancho = parseInt(readlineSync.question("Ingresa el valor del ancho del rectángulo: "));
        let areaRectangulo = largo * ancho;
        console.log(`El área del rectángulo es: ${areaRectangulo}`);
        break;

    case '3':
        let lado = parseInt(readlineSync.question("Ingresa el valor del lado del cuadrado: "));
        let areaCuadrado = lado * lado;
        console.log(`El área del cuadrado es: ${areaCuadrado}`);
        break;

    case '4':
        let Bmayor = parseInt(readlineSync.question("Ingresa el valor de la base mayor: "));
        let Bmenor = parseInt(readlineSync.question("Ingresa el valor de la base menor: "));
        let altura = parseInt(readlineSync.question("Ingresa la altura del trapecio: "));
        let areaTrapecio = ((Bmayor + Bmenor) * altura) / 2;
        console.log(`El área del trapecio es: ${areaTrapecio}`);
        break;

    default:
        console.log("Opción no válida.");
        break;
}

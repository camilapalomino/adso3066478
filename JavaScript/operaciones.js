const readline = require('readline');

// Crear la interfaz de lectura de consola
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Solicitar los valores al usuario
rl.question('Ingrese valor: ', (A) => {
    rl.question('Ingrese valor: ', (B) => {
        // Convertir los valores a enteros
        A = parseInt(A);
        B = parseInt(B);

        // Realizar las operaciones
        let suma = A + B;
        console.log('La suma de los numeros es: ' + suma);

        let res = A - B;
        console.log('La resta de los numeros es: ' + res);

        let multi = A * B;
        console.log('La multiplicación de los numeros es: ' + multi);

        if (B !== 0) {
            let div = A / B;
            console.log('La división de los numeros es: ' + div);
        } else {
            console.log('No se puede dividir entre cero');
        }

        let igual = (A === B);
        console.log('El número ' + (igual ? 'es' : 'no es') + ' igual: ' + A);

        if (A > B) {
            console.log('El número menor es: ' + B);
            console.log('El número mayor es: ' + A);
        } else if (A < B) {
            console.log('El número menor es: ' + A);
            console.log('El número mayor es: ' + B);
        } else {
            console.log('Los dos números son iguales');
        }

        // Cerrar la interfaz de lectura
        rl.close();
    });
});

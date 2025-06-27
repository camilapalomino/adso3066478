const readline = require('readline');

// Crear interfaz de lectura de consola
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Solicitar los datos al usuario//
//rl.question() para hacer preguntas al usuario y obtener las respuestas. Cada vez que el usuario responde, el siguiente bloque de código se ejecuta.//

rl.question('Escriba sus nombres completos: ', (a) => {
    rl.question('Escriba sus apellidos completos: ', (b) => {
        rl.question('Escriba su profesión: ', (c) => {
            rl.question('Escriba su año de nacimiento: ', (d) => {
                // Calcular la edad
                let e = 2025 - parseInt(d);

                // Mostrar el resultado
                console.log(`El (La) ${c} ${a} ${b} tiene ${e} años.`);
                
                // Cerrar la interfaz de lectura
                rl.close();
            });
        });
    });
});

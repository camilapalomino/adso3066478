const readline = require('readline');

// Crear interfaz de lectura de consola
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Solicitar los valores de voltaje y resistencia al usuario
rl.question('Ingrese el valor del voltaje del circuito: ', (Voltaje) => {
    rl.question('Ingrese el valor de la resistencia del circuito: ', (Resistencia) => {
        // Convertir las entradas a números enteros
        Voltaje = parseInt(Voltaje);
        Resistencia = parseInt(Resistencia);

        // Calcular la intensidad usando la ley de Ohm (I = V / R)
        let Intensidad = Voltaje / Resistencia;

        // Mostrar el resultado
        console.log(`Al conectar un resistor de R ${Resistencia} ohm's a una fuente de V ${Voltaje} voltios circulará una corriente de ${Intensidad} amperios.`);

        // Cerrar la interfaz de lectura
        rl.close();
    });
});

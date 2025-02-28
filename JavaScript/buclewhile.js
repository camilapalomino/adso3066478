//console.log() en lugar de echo para imprimir en JavaScript//
let contador = 0;
while (contador < 30) {
    contador++;
    console.log("iteracion" + contador);
}
//prompt() (en lugar de fgets(STDIN)//
//parseInt() para convertir el valor ingresado por el usuario en un número entero//
while (true) {
    const a = parseInt(prompt("Introduzca un valor mayor a 10:"));
    if (a > 10) {
        console.log("Es correcto");
    } else {
        console.log("Es incorrecto, pruebe un número nuevo");
        break;
    }
}

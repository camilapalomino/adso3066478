let coche = {
    marca: 'Ford',
    color: 'rojo',
    modelo: 'sedan',
    placa: 'PQS123'
};

console.log(coche.color); // Imprime 'rojo'

coche.color = 'verde';
console.log(coche.color); // Imprime 'verde'

console.log(coche.marca); // Imprime 'Ford'

coche.marca = 'Renault';
console.log(coche.marca); // Imprime 'Renault'

console.log(coche); // Imprime el objeto completo

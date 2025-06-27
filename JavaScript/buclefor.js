// Primer parte: Imprimir los nombres
const nombres = ['camila', 'yury', 'cristian', 'sebastian \n\n'];

nombres.forEach(nombre => {
    console.log(nombre);
});

// Segunda parte: Crear un array de objetos y agregar personas
const personas = [];

const a = { nombre: 'camila', edad: 22 };
const b = { nombre: 'yury', edad: 28 };
const c = { nombre: 'cristian', edad: 31 };
const d = { nombre: 'sebastian', edad: 26 };

personas.push(a, b, c, d);

// Imprimir el nombre y la edad de cada persona
personas.forEach(persona => {
    console.log(`${persona.nombre} ${persona.edad}`);
});

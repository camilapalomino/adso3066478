#include <iostream>
#include <string> 

using namespace std;

// Definir la estructura Coche
// struct para representar objetos con atributos//
struct Coche {
    string marca;
    string color;
    string modelo;
    string placa;
};

int main() {
    // Crear un objeto coche e iniciar sus valores
    Coche coche = {"Ford", "rojo", "sedan", "PQS123"};

    // Imprimir el color del coche
    //endl es utilizado para insertar un salto de línea  y vaciar los datos almacenados seria lo mismo que /n //
    cout << "Color del coche: " << coche.color << endl;

    // Modificar el color del coche
    coche.color = "verde";
    cout << "Nuevo color del coche: " << coche.color << endl;

    // Imprimir la marca del coche
    cout << "Marca del coche: " << coche.marca << endl;

    // Modificar la marca del coche
    coche.marca = "Renault";
    cout << "Nueva marca del coche: " << coche.marca << endl;

    // Imprimir todos los atributos del coche
    cout << "Detalles del coche:" << endl;
    cout << "Marca: " << coche.marca << endl;
    cout << "Color: " << coche.color << endl;
    cout << "Modelo: " << coche.modelo << endl;
    cout << "Placa: " << coche.placa << endl;

    return 0;
}

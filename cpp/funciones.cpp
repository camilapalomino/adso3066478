#include <iostream>
#include <vector>   // Necesario para trabajar con std::vector//     //std::vector para permitir cambiar el tamaño de un arreglo//
using namespace std;

// Función para multiplicar elementos de dos vectores
//void es un tipo de dato que se utiliza en varios contextos para indicar ausencia de valor o sin tipo//
void multiplicarVectores(const vector<int>& a, const vector<int>& b) {
    vector<int> c;  // Vector para almacenar el resultado
    for (size_t contador = 0; contador < a.size(); ++contador) {
        c.push_back(a[contador] * b[contador]);
    }
    // Imprimir el resultado
    cout << "Resultado de multiplicar los vectores: ";
    for (size_t i = 0; i < c.size(); ++i) {
        cout << c[i] << " ";
    }
    cout << endl;
}

// Función mostrar_texto
void mostrarTexto() {
    cout << "Hola" << endl;
}

// Función multiplicar con valores internos
void multiplicar() {
    int a = 5;
    int b = 8;
    cout << "Resultado de multiplicar dentro de la funcion: " << a * b << endl;
}

// Función multiplicar que devuelve un valor
int multiplicarYDevolver() {
    int a = 5;
    int b = 8;
    return a * b;
}

// Función para validar si un valor es igual a 5
bool validarDato(int a) {
    if (a == 5) {
        return true;
    } else {
        return false;
    }
}

int main() {
    // Parte 1: Multiplicación de dos vectores
    vector<int> a = {1, 2, 3, 4, 5}; // Primer vector
    vector<int> b = {6, 7, 8, 9, 10}; // Segundo vector
    multiplicarVectores(a, b); // Llamada a la función que multiplica los vectores

    // Parte 2: Funciones
    mostrarTexto(); // Llamada a la función que imprime 'Hola'

    multiplicar(); // Llamada a la función que multiplica valores internos

    // Multiplicar y devolver el resultado
    int resultado = multiplicarYDevolver();
    cout << "Resultado + 5: " << resultado + 5 << endl;

    // Validación de dato
    int a_val = 5;
    bool dato = validarDato(a_val);
    cout << "¿El valor es 5? " << (dato ? "Sí" : "No") << endl;

    return 0;
}

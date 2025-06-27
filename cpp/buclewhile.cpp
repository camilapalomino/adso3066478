#include <iostream>
using namespace std;

int main() {
    int contador = 0;

    // Primer ciclo while que incrementa contador hasta 30
    while (contador < 30) {
        contador += 1;
        cout << "Iteración " << contador << endl;
    }

    // Segundo ciclo while infinito que solicita un número mayor a 10
    //while (true) es lo mismo que while true en python//
    //se usa cin en lugar de input()//
    int a;
    while (true) {
        cout << "Introduzca un valor mayor a 10: ";
        cin >> a;
        if (a > 10) {
            cout << "Es correcto" << endl;
        } else {
            cout << "Es incorrecto, pruebe de nuevo" << endl;
            break;  // Salimos del ciclo si el valor no es mayor a 10
        }
    }

    return 0;
}

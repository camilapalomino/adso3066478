#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    // Lista de días de la semana
    vector<string> Lista = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    
    // Imprimir el valor en el índice 4 (Viernes)
    cout << Lista[4] << endl;

    // Imprimir la lista completa
    for (const string& dia : Lista) {
        cout << dia << " ";
    }
    cout << endl;

    // Imprimir los primeros tres elementos de la lista (Lunes, Martes, Miércoles)
    for (int i = 0; i < 3; ++i) {
        cout << Lista[i] << " ";
    }
    cout << endl;

    // Lista con más elementos y un subvector al final
    //El tipo any permite almacenar cualquier tipo de dato//
    vector<any> Lista2 = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", 1, 2, 3, vector<any>{"Esteban", 0.2, 2.25, true}};

    // Imprimir los primeros 4 elementos de la lista
    //any_cast<string>(Lista2[i]) convierte cada elemento de any a string para que pueda imprimirse correctamente//
    for (int i = 0; i < 4; ++i) {
        cout << any_cast<string>(Lista2[i]) << " ";
    }
    cout << endl;

    // Imprimir los primeros tres elementos del subvector dentro de Lista2
    vector<any> subLista = any_cast<vector<any>>(Lista2[9]);
    for (int i = 0; i < 3; ++i) {
        cout << any_cast<string>(subLista[i]) << " ";
    }
    cout << endl;

    return 0;
}

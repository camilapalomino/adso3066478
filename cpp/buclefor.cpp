#include <iostream>
#include <vector> //strings para contener nombres de personas//
#include <string>
using namespace std;

struct Persona {
    string nombre;
    int edad;
};

int main() {
    // Lista de nombres
    vector<string> nombres = {"camila", "yury", "cristian", "sebastian"};

    // Imprimir los nombres
    for (const string& nombre : nombres) {
        cout << nombre << endl;
    }

    // Lista de personas
    vector<Persona> personas;

    // Agregar personas al vector
    personas.push_back({"camila", 22});
    personas.push_back({"yury", 28});
    personas.push_back({"cristian", 31});
    personas.push_back({"sebastian", 26});

    // Imprimir los nombres y edades
    for (const Persona& persona : personas) {
        cout << persona.nombre << " " << persona.edad << endl;
    }

    return 0;
}

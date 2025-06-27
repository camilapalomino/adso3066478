#include <iostream>
#include <vector>
#include <string>
using namespace std;

// Definición de la clase Usuario
class Usuario {
public:
    string nombre;
    int pin;
    float saldo;

    // Constructor de la clase Usuario
    //this llama a un objeto//
    //-> accede a los miembros de ese objeto//
    Usuario(string nombre, int pin, float saldo) {
        this->nombre = nombre;
        this->pin = pin;
        this->saldo = saldo;
    }
};

// Definición de la clase Banco
class Banco {
public:
    vector<Usuario> usuarios;

    // Constructor de la clase Banco
    Banco(vector<Usuario> usuarios) {
        this->usuarios = usuarios;
    }

    // Método para autenticar al usuario
    bool autenticar(string nombre, int pin) {
        for (auto& usuario : usuarios) {
            if (usuario.nombre == nombre) {
                if (usuario.pin == pin) {
                    cout << "Estas Logeado" << endl;
                    return true;
                } else {
                    cout << "Pin o nombre incorrecto" << endl;
                    return false;
                }
            }
        }
        cout << "El usuario no existe" << endl;
        return false;
    }

    // Método para retirar dinero
    void sacar_dinero(string nombre, float saldo) {
        for (auto& usuario : usuarios) {
            if (usuario.nombre == nombre) {
                if (usuario.saldo < saldo) {
                    cout << "Saldo insuficiente" << endl;
                    return;
                } else {
                    usuario.saldo -= saldo;
                    cout << "El saldo disponible es " << usuario.saldo << endl;
                    return;
                }
            }
        }
    }
};

int main() {
    // Creación de objetos de la clase Usuario
    Usuario ana("Ana", 9872, 450.0);
    Usuario pablo("Pablo", 5555, 200.0);
    Usuario rodrigo("Rodrigo", 2222, 900.0);

    // Creación de la clase Banco
    Banco banco({ana, pablo, rodrigo});

    while (true) {
        cout << "Bienvenido al Banco, por favor, identifiquese." << endl;
        cout << "Introduzca el nombre: ";
        string nombre;
        cin >> nombre;

        cout << "Introduzca el pin: ";
        int pin;
        cin >> pin;

        if (banco.autenticar(nombre, pin)) {
            while (true) {
                cout << "Por favor, elija una de estas opciones:" << endl;
                cout << "1. Sacar dinero" << endl;
                cout << "2. Terminar sesión" << endl;
                string opcion;
                cin >> opcion;

                if (opcion == "1") {
                    cout << "Introduce cantidad a sacar: ";
                    float cantidad;
                    cin >> cantidad;
                    banco.sacar_dinero(nombre, cantidad);
                } else if (opcion == "2") {
                    cout << "Saliendo del sistema." << endl;
                    break;
                } else {
                    cout << "Opción incorrecta. Por favor, introduzca otra opción." << endl;
                }
            }
        } else {
            cout << "Usuario no autenticado. Por favor, Introduzca nombre y pin correctos." << endl;
        }
    }

    return 0;
}

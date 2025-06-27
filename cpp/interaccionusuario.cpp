#include <iostream>
#include <string>

using namespace std;

int main() {
    string a, b, c;  // Variables para los nombres, apellidos y profesión
    int d, e;  // Variables para el año de nacimiento y la edad

    // Solicitar los datos al usuario
    //getline(cin, a) Lee una línea completa de texto (incluidos los espacios) y la almacena en la variable a//
    cout << "Escriba sus nombres completos: ";
    getline(cin, a);
    
    cout << "Escriba sus apellidos completos: ";
    getline(cin, b);
    
    cout << "Escriba su profesion: ";
    getline(cin, c);
    
    //cin se usa para leer el año de nacimiento como un número entero y almacenarlo en la variable d//
    cout << "Escriba su año de nacimiento: ";
    cin >> d;

    // Calcular la edad
    e = 2025 - d;

    // Mostrar el resultado
    //<< para concatenar las cadenas y variables en el mensaje//
    cout << "El (La) " << c << " " << a << " " << b << " tiene " << e << " años." << endl;

    return 0;
}

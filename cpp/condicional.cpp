#include <iostream>
#include <cmath>  // Para funciones matemáticas 
#include <string> // Para manejar cadenas (strings)

using namespace std;

// float para ingresar una variable con decimales// 
int main() {
    int Figura;
    float Pi = 3.1416;
    const int const_value = 2;
    float Area;

    // Solicitar la figura a calcular
    cout << "Seleccione la figura a calcular su area: \n";
    cout << "1 para rombo\n";
    cout << "2 para rectangulo\n";
    cout << "3 para cuadrado\n";
    cout << "4 para trapecio\n";
    cout << "Ingrese su opcion: ";
    cin >> Figura;

    //switch en C++ es una estructura de control condicional que permite ejecutar diferentes bloques de código//
    switch (Figura) {
        case 1: { // Caso para el rombo
            float Dmayor, Dmenor;
            cout << "Ingresa el valor de la diagonal mayor: ";
            cin >> Dmayor;
            cout << "Ingresa el valor de la diagonal menor: ";
            cin >> Dmenor;
            Area = (Dmayor * Dmenor) / const_value;  // Area del rombo
            cout << "El area del rombo es: " << Area << endl;
            break;
        }
        case 2: { // Caso para el rectángulo
            float Largo, Ancho;
            cout << "Ingresa el valor del largo del rectángulo: ";
            cin >> Largo;
            cout << "Ingresa el valor del ancho del rectángulo: ";
            cin >> Ancho;
            Area = Largo * Ancho;  // Area del rectángulo
            cout << "El area del rectángulo es: " << Area << endl;
            break;
        }
        case 3: { // Caso para el cuadrado
            float Lado;
            cout << "Ingresa el valor del lado del cuadrado: ";
            cin >> Lado;
            Area = Lado * Lado;  // Area del cuadrado
            cout << "El area del cuadrado es: " << Area << endl;
            break;
        }
        case 4: { // Caso para el trapecio
            float Bmayor, Bmenor, H;
            cout << "Ingresa el valor de la base mayor: ";
            cin >> Bmayor;
            cout << "Ingresa el valor de la base menor: ";
            cin >> Bmenor;
            cout << "Ingresa la altura del trapecio: ";
            cin >> H;
            Area = ((Bmayor + Bmenor) * H) / 2;  // Area del trapecio
            cout << "El area del trapecio es: " << Area << endl;
            break;
        }
        default: { // Caso para valores incorrectos o sin selección válida
            Area = Pi * Pi;  // Área relacionada con Pi (esto puede ser un área de círculo, pero está mal definido en Python)
            cout << "Area calculada con Pi: " << Area << endl;
            break;
        }
    }

    return 0;
}

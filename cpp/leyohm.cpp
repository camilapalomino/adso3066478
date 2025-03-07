#include <iostream>

using namespace std;

int main() {
    int Voltaje, Resistencia;
    float Intensidad;

    // Solicitar los valores de voltaje y resistencia
    cout << "Ingrese el valor del voltaje del circuito: ";
    cin >> Voltaje;

    cout << "Ingrese el valor de la resistencia del circuito: ";
    cin >> Resistencia;

    // Calcular la intensidad (ley de Ohm)
    //static_cast<float>(Voltaje) convierte Voltaje de tipo int a float para que el cálculo de la corriente tenga decimales si es necesarioS//
    Intensidad = static_cast<float>(Voltaje) / Resistencia;

    // Imprimir el resultado
    cout << "Al conectar un resistor de R " << Resistencia << " ohmios a una fuente de V " << Voltaje << " voltios, circulará una corriente de " << Intensidad << " amperios." << endl;

    return 0;
}

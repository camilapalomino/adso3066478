#include <iostream>
#include <typeinfo>  // Para usar typeid y obtener el tipo de una variable

using namespace std;

int main() {
    int a = 10;
    int b = 4;

    // Multiplicación
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: *" << endl;
    cout << "La segunda variable es: " << b << endl;
    int c = a * b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;  // Imprime el tipo de la variable c (int)

    // División
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: /" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a / b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    // Suma
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: +" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a + b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    // Resta
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: -" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a - b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    // Exponenciación (en C++ no existe el operador `**`, usamos `pow`)
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: **" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = static_cast<int>(pow(a, b));  // Usamos `pow` de la librería <cmath>
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    // Módulo o porcentaje
    //el comando double tiene mayor precision que float//
    double a = ;        // Número del cual calcular el porcentaje
    double b = ;      // Porcentaje a calcular
    double resultado;

    // Calcular el porcentaje del número
    resultado = (numero * porcentaje) / 100;

    // Mostrar el resultado
    cout << "El " << porcentaje << "% de " << numero << " es: " << resultado << endl

    return 0;
}

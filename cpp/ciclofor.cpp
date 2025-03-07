#include <iostream>
#include <cmath>  // Para usar la función pow() que calcula la potencia

using namespace std;

int main() {
    int A, C;
    
    // Solicitar el primer valor
    cout << "Ingrese el primer valor: ";
    cin >> A;

    // Inicia la variable B 
    int B = 0;

    // Solicitar el segundo valor
    cout << "Ingrese el segundo valor: ";
    cin >> C;

    // Calcular la potencia de A elevado a C
    int valor = pow(A, C);  // 'pow' devuelve el valor de A elevado a C

    // Imprimir el resultado
    cout << "La potencia de " << A << " sobre " << C << " es: " << valor << endl;

    return 0;
}

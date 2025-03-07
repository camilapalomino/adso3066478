#include <iostream>

using namespace std;

int main() {
    int A, B;
    
    // Solicitar los valores al usuario
    cout << "Ingrese valor A: ";
    cin >> A;

    cout << "Ingrese valor B: ";
    cin >> B;

    // Realizar operaciones
    int suma = A + B;
    cout << "La suma de los numeros es: " << suma << endl;

    int res = A - B;
    cout << "La resta de los numeros es: " << res << endl;

    int multi = A * B;
    cout << "La multiplicación de los numeros es: " << multi << endl;

    float div = static_cast<float>(A) / B;  // Para obtener un resultado con decimales
    cout << "La división de los numeros es: " << div << endl;

    bool igual = (A == B);
    cout << "¿Los numeros son iguales? " << (igual ? "Sí" : "No") << endl;

    bool mayor = (A > B);
    cout << "El número menor es: " << (mayor ? B : A) << endl;
    cout << "El número mayor es: " << (mayor ? A : B) << endl;

    return 0;
}

#include <iostream>

using namespace std;

// definificion de variables booleanas//
int main() {
    bool a = true;
    bool b = false;
    
    // Operación lógica "AND"
    //Debido a que el operador && devuelve true solo cuando ambas condiciones son verdaderas, el resultado de la operación es false. En C++, false se imprime como 0//
    cout << (a && b) << endl;  // Evaluará "true && false" (resultado será false)

    // Asignación de valores numéricos
    int x = 2;
    int y = 3;
    int z = 4;
    int w = 10;

    // Operación lógica con comparación
    cout << (x == y && z < w) << endl;  // Evaluará "2 == 3 && 4 < 10" (resultado será false)

    // Negación y operación lógica
    cout << (!(x == y) && z > w) << endl;  // Evaluará "!(2 == 3) && 4 > 10" (resultado será false)

    return 0;
}

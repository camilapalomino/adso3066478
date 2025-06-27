#include <iostream>
#include <string>  // Para trabajar con cadenas de texto (strings)

using namespace std;

int main() {
    
    int a = 2;
    string Nombre = "luis";
    int Edad = 28;
    string Pais = "Colombia";

    // Primer bloque: Verificar si 'a' es igual a 2
    //== se usa para verificar si dos valores son iguales//
    if (a == 2) {
        cout << "a vale 2" << endl;
    } else {
        cout << "a es diferente de 2" << endl;
    }

    // Segundo bloque: Condicionales con múltiples comparaciones
    //!= se usa para verificar si dos valores son diferentes//
    //&& se usa para la conjunción lógica "Y" todas las condiciones deben ser verdaderas//
    //! se usa para negar una condición, similar a not en Python//
    if (Nombre == "luis" && Edad == 28 && Pais == "Colombia") {
        cout << "Su nombre es " << Nombre << ", tiene " << Edad << " y es de " << Pais << endl;
    } else if (Nombre == "luis" && !(Edad == 28)) {
        cout << "Su nombre es luis y no tiene 28 años" << endl;
    } else if (Nombre != "luis" && Edad == 28) {
        cout << "Su nombre no es luis y tiene 28 años" << endl;
    } else {
        cout << "No se llama luis ni tiene 28 años" << endl;
    }

    return 0;
}

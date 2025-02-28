Contador=0
while Contador<30:
    Contador += 1
    print('iteracion', Contador)

while True:
    print('introduzca  un valor mayor a 10')
    a = int(input())
    if a > 10:
        print('Es correcto')
    else:
        print('Es incorrecto, pruebe de nuevo')
        break
        
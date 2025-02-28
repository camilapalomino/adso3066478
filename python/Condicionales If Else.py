a=2
if a ==2:
    print('a vale 2')
else:
    print('a es diferente de 2')


Nombre = 'luis'
Edad = 28
Pais='Colombia'

if Nombre =='luis' and Edad == 28 and Pais =='Colombia':
    print('Su nombre es', Nombre,'tiene',Edad,'y es de',Pais) 
elif Nombre == 'luis'and not Edad==28:
    print('Su nombre es luis y no tiene 28 años')
elif Nombre != 'luis'and Edad == 28:
    print('Su nombre no es luis y tiene 28 años')
else:
    print('No se llama luis ni tiene 28 años')         
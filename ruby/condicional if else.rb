# Primer ejemplo: Comparar si a es igual a 2
a = 2
if a == 2
  puts 'a vale 2'
else
  puts 'a es diferente de 2'
end

# Segundo ejemplo: Verificar condiciones con 'and', 'not' y '!='
nombre = 'luis'
edad = 28
pais = 'Colombia'

#elsif se utiliza para manejar múltiples condiciones#
if nombre == 'luis' && edad == 28 && pais == 'Colombia'
  puts "Su nombre es #{nombre}, tiene #{edad} y es de #{pais}"
elsif nombre == 'luis' && !(edad == 28)
  puts 'Su nombre es luis y no tiene 28 años'
elsif nombre != 'luis' && edad == 28
  puts 'Su nombre no es luis y tiene 28 años'
else
  puts 'No se llama luis ni tiene 28 años'
end

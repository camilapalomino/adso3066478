# Crear una lista de días de la semana
lista = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado']

# Imprimir el valor en el índice 4 (Viernes)
puts lista[4]

# Imprimir toda la lista
puts lista

# Imprimir una porción de la lista (índices de 0 a 3)
puts lista[0..3]

# Crear una lista con días, números y una sublista
lista_compleja = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 1, 2, 3, ['Esteban', 0.2, 2.25, true]]

# Imprimir una porción de la lista y también acceder a la sublista en el índice 9
puts "#{lista_compleja[0..3]} #{lista_compleja[9][0..2]}"

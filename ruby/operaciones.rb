# Solicitar el primer valor
print 'Ingrese valor: '
a = gets.to_i

# Solicitar el segundo valor
print 'Ingrese valor: '
b = gets.to_i

# Realizar las operaciones matemáticas
suma = a + b
puts "La suma de los números es: #{suma}"

res = a - b
puts "La resta de los números es: #{res}"

multi = a * b
puts "La multiplicación de los números es: #{multi}"

div = a / b.to_f  # Convertir b a flotante para una división precisa
puts "La división de los números es: #{div}"

# Comparaciones
igual = a == b
puts "El número es igual: #{igual}"

mayor = a > b
puts "El número mayor es: #{mayor ? a : b}"

# Para imprimir el número menor
menor = a < b
puts "El número menor es: #{menor ? a : b}"

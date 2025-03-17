# Solicitar el nombre completo
print 'Escriba sus nombres completos: '
a = gets.chomp

# Solicitar los apellidos completos
print 'Escriba sus apellidos completos: '
b = gets.chomp

# Solicitar la profesión
print 'Escriba su profesion: '
c = gets.chomp

# Solicitar el año de nacimiento
print 'Escriba su año de nacimiento: '
d = gets.to_i

# Calcular la edad
e = 2025 - d

# Imprimir el resultado
puts "El (La) #{c} #{a} #{b} tiene #{e} años"

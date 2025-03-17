# Definir una constante para Pi
PI = 3.1416

# Solicitar al usuario seleccionar la figura para calcular su área
# chomp se usa para eliminar el salto de línea adicional #
puts "Seleccione la figura a calcular su área:"
puts "1 para rombo"
puts "2 para rectángulo"
puts "3 para cuadrado"
puts "4 para trapecio"
print ": "
figura = gets.chomp

# Evaluar la figura seleccionada
# to_i convierte en un número entero #
case figura
when '1'  # Rombo
  print "Ingresa el valor de la diagonal mayor: "
  dmayor = gets.to_i
  print "Ingresa el valor de la diagonal menor: "
  dmenor = gets.to_i
  area = (dmayor * dmenor) / 2
  puts "El área del rombo es: #{area}"

when '2'  # Rectángulo
  print "Ingresa el valor del largo del rectángulo: "
  largo = gets.to_i
  print "Ingresa el valor del ancho del rectángulo: "
  ancho = gets.to_i
  area = largo * ancho
  puts "El área del rectángulo es: #{area}"

when '3'  # Cuadrado
  print "Ingresa el valor del lado del cuadrado: "
  lado = gets.to_i
  area = lado * lado
  puts "El área del cuadrado es: #{area}"

when '4'  # Trapecio
  print "Ingresa el valor de la base mayor: "
  bmayor = gets.to_i
  print "Ingresa el valor de la base menor: "
  bmenor = gets.to_i
  print "Ingresa la altura del trapecio: "
  altura = gets.to_i
  area = ((bmayor + bmenor) * altura) / 2
  puts "El área del trapecio es: #{area}"

else
  puts "Opción no válida."
end

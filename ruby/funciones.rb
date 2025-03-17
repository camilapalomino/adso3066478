# Multiplicación de elementos correspondientes de dos arrays

a = [1, 2, 3, 4, 5]
b = [6, 7, 8, 9, 10]
c = []

a.each_with_index do |element, index|
  c.push(element * b[index])
end

puts c

# Funciones

# Definición y llamada
def mostrar_texto
  puts 'hola'
end

mostrar_texto

def multiplicar
  a = 5
  b = 8
  puts a * b
end
multiplicar

def multiplicar
  puts a * b
end

a = 5
b = 8
multiplicar

def multiplicar
  a = 5
  b = 8
  return a * b
end

resultado = multiplicar
puts resultado + 5

def validar_dato
  if a == 5
    return true
  else
    return false
  end
end

a = 5
dato = validar_dato
puts dato

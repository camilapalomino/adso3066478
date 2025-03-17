#se usa un hash para almacenar pares clave-valor#
coche = {
  "marca"  => "Ford",
  "color"  => "rojo",
  "modelo" => "sedan",
  "placa"  => "PQS123"
}

# Imprimir el valor de 'color'
puts "Color del coche: #{coche['color']}"

# Modificar el valor de 'color'
coche["color"] = "verde"
puts "Nuevo color del coche: #{coche['color']}"

# Imprimir el valor de 'marca'
puts "Marca del coche: #{coche['marca']}"

# Modificar el valor de 'marca'
coche["marca"] = "Renault"
puts "Nueva marca del coche: #{coche['marca']}"

# Imprimir todo el hash
puts "Información del coche:"
coche.each do |key, value|
  puts "#{key}: #{value}"
end

# Primer ciclo while con contador
contador = 0
while contador < 30
  contador += 1
  puts "Iteración #{contador}"
end

# Segundo ciclo while con comprobación de un valor mayor a 10
loop do
  puts 'Introduzca un valor mayor a 10'
  a = gets.to_i
  if a > 10
    puts 'Es correcto'
  else
    puts 'Es incorrecto, pruebe de nuevo'
    break
  end
end

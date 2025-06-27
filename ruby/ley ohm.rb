# Solicitar el valor del voltaje
print 'Ingrese el valor del voltaje del circuito: '
voltaje = gets.to_i

# Solicitar el valor de la resistencia
print 'Ingrese el valor de la resistencia del circuito: '
resistencia = gets.to_i

# Calcular la intensidad utilizando la Ley de Ohm: I = V / R
intensidad = voltaje / resistencia

# Imprimir el resultado
puts "Al conectar un resistor de R#{resistencia} ohm a una fuente de V#{voltaje} voltios, circulará una corriente de #{intensidad} amperios"

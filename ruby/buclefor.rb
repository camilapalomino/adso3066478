# Definimos un arreglo de nombres
nombres = ['camila', 'yury', 'cristian', 'sebastian']

# Usamos un bucle para imprimir cada nombre en el arreglo
nombres.each do |nombre|
  puts nombre
end

# Definimos un arreglo vacío para almacenar personas
personas = []

# Creamos un hash para cada persona con nombre y edad
a = {'nombre' => 'camila', 'Edad' => 22}
b = {'nombre' => 'yury', 'Edad' => 28}
c = {'nombre' => 'cristian', 'Edad' => 31}
d = {'nombre' => 'sebastian', 'Edad' => 26}

# Agregamos cada hash al arreglo personas
personas.push(a)
personas.push(b)
personas.push(c)
personas.push(d)

# Usamos un bucle para imprimir el nombre y la edad de cada persona
personas.each do |persona|
  puts "#{persona['nombre']} #{persona['Edad']}"
end

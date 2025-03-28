## instalar desde terminal gem install mongo

require 'mongo'

begin
  cliente = Mongo::Client.new('mongodb://localhost:27017/')

  puts cliente
  puts "Conexión exitosa"

  puts "Tipo de conexión: #{cliente.class}"

  puts "Bases de datos disponibles: #{cliente.database_names}"

rescue Mongo::Error => e
  puts "Error al conectar a MongoDB: #{e.message}"
end

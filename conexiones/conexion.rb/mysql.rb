## instalar gem install mysql2 desde el terminal ##

require 'mysql2'

begin
  client = Mysql2::Client.new(
    host: "localhost",
    username: "root",
    password: "",
    database: "comercio" 
  )

  puts client
  puts "Conexión exitosa"

rescue Mysql2::Error => e
  puts "Error de conexión: #{e.message}"
end
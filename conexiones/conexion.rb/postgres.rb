## instalar desde el terminal gem install pg

require 'pg'

begin
  conn = PG.connect(
    host: 'localhost',
    user: 'postgres',
    password: '1234',
    dbname: 'postgres',
    port: 5432
  )

  puts conn
  puts "Conexión exitosa"

rescue PG::Error => e
  puts "Error de conexión: #{e.message}"
ensure
  conn.close if conn
end

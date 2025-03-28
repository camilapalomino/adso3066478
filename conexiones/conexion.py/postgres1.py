import psycopg2



conn = psycopg2.connect(
        host = "localhost",
        user = "postgres", 
        password = "1234", 
        database = "postgres",
        port = 5432
    )

print (conn)
print ("conexion exitosa")

## funciona 
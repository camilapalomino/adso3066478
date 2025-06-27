import mysql.connector


conn = mysql.connector.connect (
        host="localhost", 
        user="root", 
        password="", 
    )

print (conn)
print ("conexion exitosa")

## funciona 
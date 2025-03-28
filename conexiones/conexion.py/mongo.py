import pymongo


cliente = pymongo.MongoClient ("mongodb://localhost:27017/")

print(cliente)
print("conexión exitosa")

print(f"tipo de conexion: {type(cliente)}")

print ("bases de datos disponibles:", cliente.list_database_names())

## funciona 
import pymongo
import pymongo.mongo_client

cliente = pymongo.mongo_client("mongodb://localhost:27017/")
db = cliente['adso_sena_cba']

usuarios=db['usuarios']
productos=db['productos']
inventarios=db ['inventarios']
ventas=db ['ventas']
print ("conexion exitosa a la base de datos.")

# Paso 1: Instalar pymongo

# Paso 2: Crear un archivo de utilidad para conectar a MongoDB
from pymongo import MongoClient

def get_mongo_client():
    cliente = MongoClient("mongodb://localhost:27017/")

    print(cliente)
    print("Conexión exitosa")

    print(f"Tipo de conexión: {type(cliente)}")
    print("Bases de datos disponibles:", cliente.list_database_names())

    return cliente

# paso 3 añadir la URL para probar desde el navegador desde urls.py 

from django.urls import path
from .views import test_mongo_connection

urlpatterns = [
    path('test-mongo/', test_mongo_connection),
]




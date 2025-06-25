import pandas as pd
import sqlite3

#df significa data frame
# el comando pd.read_csv lee el archivo csv

df = pd.read_csv("datos.csv")
print("Datos leídos del CSV:")
print(df)

df ["salario_ajustado"] = df["salario"] * 1.50
print ("\n Nuevo Salario:\n", df)

#conexion a base de datos SQLite

conn = sqlite3.connect("empleados.db")
cursor = conn.cursor()

cursor.execute('''
         CREATE TABLE IF NOT EXISTS empleados (
        id INTEGER PRIMARY KEY,
        nombre TEXT,
        edad INTEGER,
        salario REAL,
        salario_ajustado REAL
    )
               ''')

#el comando df.to_sql usa pandas para guardar un DataFrame (df) dentro de una base de datos SQL
#if_exists="replace" Si la tabla ya existe, la reemplaza por completo

df.to_sql("empleados", conn, if_exists="replace")

#leer desde la base de datos 

consulta = pd.read_sql("SELECT * FROM empleados", conn)
print ("\n Consulta desde la Base de Datos: \n", consulta)

#para hacer una tabla excel 

consulta.to_excel("reporte_empleados.xlsx")
print ("\n Generado Correctamente \n")
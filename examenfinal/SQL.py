import psycopg2
from psycopg2 import sql

conn = psycopg2.connect(
        host = "localhost",
        user = "postgres", 
        password = "1234", 
        database = "postgres",
        port = 5432
    )

conn.autocommit = True 
cur = conn.cursor()

nueva_bd = "_mi_empresa_"
cur.execute(sql.SQL("CREATE DATABASE {}").format(
        sql.Identifier(nueva_bd)
    ))

print(f"Base de datos '{"_mi_empresa_"}' creada exitosamente.")
cur.close()
conn.close()

conn = psycopg2.connect(
    host="localhost",
    user="postgres",
    password="1234",
    database="_mi_empresa_",
    port=5432
)

cur = conn.cursor()

cur.execute("""
    CREATE TABLE IF NOT EXISTS empleados (
        id SERIAL PRIMARY KEY,
        nombre VARCHAR(100),
        cargo VARCHAR(100),
        salario NUMERIC
    );
""")

print("Tabla 'empleados' creada exitosamente.")

empleados_data = [
    ('Juan Pérez', 'Gerente', 3500000),
    ('Ana López', 'Desarrolladora', 2800000),
    ('Carlos Ruiz', 'Diseñador', 1800000),
    ('Marta Gómez', 'Analista', 2200000),
    ('Luis Torres', 'Soporte Técnico', 1500000),
]

cur.executemany("""
    INSERT INTO empleados (nombre, cargo, salario) VALUES (%s, %s, %s);
""", empleados_data)

conn.commit()

cur.execute("""
    SELECT * FROM empleados WHERE salario > 2000000;
""")
empleados = cur.fetchall()

print ("los empleados con un salario mayor a 2000000 son: ")
for emp in empleados:
    print (emp)

cur.close()
conn.commit()
conn.close()

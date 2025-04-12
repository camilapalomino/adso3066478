# paso 1 instalar conector para MySQL compatible con Django desde el terminal pip install pymysql 

# paso 2 configurar la base de datos desde settings.py 

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.mysql',
        'NAME': 'nombre_de_tu_base_de_datos',
        'USER': 'root',
        'PASSWORD': '',
        'HOST': 'localhost',
        'PORT': '3306',
    }
}





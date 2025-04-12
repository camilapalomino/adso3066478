#1. Configurar la base de datos en settings.py

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.postgresql',
        'NAME': 'postgres',
        'USER': 'postgres',
        'PASSWORD': '1234',
        'HOST': 'localhost',
        'PORT': '5432',
    }
}

#2. Crear un archivo para probar la conexión ecommerce/management/commands/test_db.py

from django.ecommerce.management.base import BaseCommand
from django.db import connection

class Command(BaseCommand):
    help = "Test PostgreSQL database connection"

    def handle(self, *args, **kwargs):
        try:
            with connection.cursor() as cursor:
                cursor.execute("SELECT version();")
                db_version = cursor.fetchone()
                self.stdout.write(self.style.SUCCESS(f"Conexión exitosa: {db_version[0]}"))
        except Exception as e:
            self.stderr.write(self.style.ERROR(f"Error en la conexión: {str(e)}"))

# por ultimo para comprobar ejecutar el comando python manage.py test_db


from django.db import models

class Producto(models.Model):
    nombre = models.CharField(max_length=100)
    precio = models.FloatField()

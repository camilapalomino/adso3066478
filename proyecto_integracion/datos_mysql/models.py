from django.db import models

class Orden(models.Model):
    producto = models.CharField(max_length=100)
    cantidad = models.IntegerField()
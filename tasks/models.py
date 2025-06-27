from django.db import models

class Task (models.Model):
    tittle = models.CharField(max_length=200)
    completed = models.BooleanField(default=False)

    def __str__(self):
        return self.tittle



# Create your models here.

from rest_framework import serializers
from .models import usuario

class usuarioseralizado(serializers.ModelSerializer):
    class Meta:
        model = usuario
        fields = [
            'id','nombre','apellido','correo','telefono','rol'
        ]

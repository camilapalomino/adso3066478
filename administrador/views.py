from rest_framework import generics
from .serializers import usuarioseralizado
from .models import usuario
import numpy as np 


class administradorList(generics.ListAPIView):
    queryset = usuario.objects.all()
    serializer_class = usuarioseralizado

class administradorCreate(generics.CreateAPIView):
    queryset = usuario.objects.all ()
    serializer_class = usuarioseralizado

class administradorRetrive(generics.RetrieveAPIView):
    queryset = usuario.objects.all ()
    serializer_class = usuarioseralizado

class administradorUpdate(generics.UpdateAPIView):
    queryset = usuario.objects.all ()
    serializer_class = usuarioseralizado

class administradorDestroy(generics.DestroyAPIView):
    queryset = usuario.objects.all ()
    serializer_class = usuarioseralizado



    
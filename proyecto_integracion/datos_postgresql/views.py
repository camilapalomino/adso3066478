from django.shortcuts import render
from .models import Cliente
import matplotlib.pyplot as plt
import io
import base64

#base64 para codificar el gráfico como una cadena que puede incrustarse en HTML.


def vista_grafico(request):
    clientes = Cliente.objects.using('postgresql_db').count()
#Crea una figura (fig) y un eje (ax) para graficar. Es el contenedor básico para gráficos en matplotlib.
    fig, ax = plt.subplots()
    ax.bar(['Clientes'], [clientes])
    buf = io.BytesIO()
#  buf = io.BytesIO()Crea un objeto de memoria (buf) que actuará como un archivo para guardar la imagen del gráfico.
    plt.savefig(buf, format='png')
#plt.savefig(buf, format='png'Guarda el gráfico generado en `buf` con formato PNG, en lugar de guardarlo en disco
    buf.seek(0)
#buf.seek(0)Regresa el puntero del archivo al inicio para poder leer su contenido.
    image_base64 = base64.b64encode(buf.getvalue()).decode('utf-8')
#convierte la imagen binaria en texto **base64**, para que se pueda incrustar directamente en el HTML
    buf.close()

    return render(request, 'datos_postgresql/grafico.html', {'grafico': image_base64})

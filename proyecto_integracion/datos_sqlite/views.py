from django.shortcuts import render
from .models import Producto
from pandas import pd
from numpy import np

def vista_pandas(request):
    productos = Producto.objects.using('default').all().values()
    df = pd.DataFrame(productos)

    if not df.empty:
        df['precio_doble'] = df['precio'] * 2
        promedio = np.mean(df['precio'])
    else:
        promedio = 0

    return render(request, 'datos_sqlite/vista_pandas.html', {
        'data': df.to_html(classes="table table-striped"),
        'promedio': promedio,
    })


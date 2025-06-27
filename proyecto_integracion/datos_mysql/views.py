from django.shortcuts import render
from .models import Orden
from django.core.paginator import Paginator

def vista_mysql(request):
    ordenes = Orden.objects.using('mysql_db').all()
    paginator = Paginator(ordenes, 5)
    page = request.GET.get('page')
    paged = paginator.get_page(page)
    return render(request, 'datos_mysql/vista_mysql.html', {'ordenes': paged})


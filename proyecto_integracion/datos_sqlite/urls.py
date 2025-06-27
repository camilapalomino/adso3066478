from django.urls import path
from .views import vista_pandas

urlpatterns = [
    path('', vista_pandas, name='vista_pandas'),
]

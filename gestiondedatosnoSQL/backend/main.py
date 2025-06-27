from producto_crud import *

categoria_id = "605c72b44f1czt34h65u7no967" 
producto = crear_producto(
    "Abono orgánico",
    "Producto natural para plantas",
    18000,
    20,
    categoria_id,
    ["S", "M"],
    ["Verde", "Marrón"]
)
print(producto)
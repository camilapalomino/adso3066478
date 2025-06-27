from rich.console import Console 
from rich.table import Table 
from rich.panel import Panel
from bson.objectid import ObjectId

Console = Console()

def run(db):
    """Módulo de operaciones CRUD"""
    console.print(Panel.fit("📝 [bold cyan]Operaciones CRUD en MongoDB[/bold cyan] 📝"))

    collections = db.list_collection_names()
    if not collections:
        console.print("\ni️ No hay colecciones en esta base de datos. Creando una nueva...")
        collection_name = "ejemplo_crud"
        db.create_collection(collection_name)

    else: 
        collection_name = console.input(f"\nIngrese el nombre de la colección ({', '.join(collections)}): ")

    collection = db(collection_name)

    while True:

        table = Table(title="Operaciones CRUD", show_header=True)
        table.add_column("Opción", style="cyan")
        table.add_column("Operación", style="green")
        table.add_column("Descripción", style="white")
        table.add_row("1", "Insertar", "Agregar nuevos documentos")
        table.add_row("2", "Buscar", "Consultar documentos")
        table.add_row("3", "Actualizar", "Modificar documentos")
        table.add_row("4", "Eliminar", "Borrar documentos")
        table.add_row("5", "Conteo", "Contar documentos")
        table.add_row("0", "Volver","Regresar al menú principal")
        
        console.print(table)
        
        choice = console.input("\n🔹Seleccione una operación CRUD (0-5): ")
        
        if choice == "0":
            break

        elif choice == "1":

            console.print("\n[bold]Insertar documentos[/bold]")
            console.print("1. Insertar uno\n2. Insertar varios")
            insert_choice = console.input("Seleccione opción (1-2): ")
            if insert_choice == "1":
                doc = {}
                while True:
                    key = console.input("Ingrese clave (o dejar vacío para terminar): ")
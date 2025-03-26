from guerrero import Guerrero
from hechicero import Hechicero 
from espada import Espada 
from conjuro import Conjuro 

guererro = Guerrero ("Thorg", 50)
hechicero = Hechicero ("Merlin", 50)

espada = Espada ("Espada del valor", 50)
conjuro = Conjuro ("Bola de fuego", 30)

guererro.equipar_arma(espada)
hechicero.aprender_conjuro(conjuro)

guererro.atacar(hechicero)
hechicero.lanzar_conjuro(guererro)

nombres=['camila','yury','cristian','sebastian \n\n']
for nombre in nombres:
    print(nombre)

Personas=[]
a={'nombre':'camila', 'Edad': 22}
b={'nombre':'yury', 'Edad': 28}
c={'nombre':'cristian', 'Edad': 31}
d={'nombre':'sebastian', 'Edad': 26}
Personas.append(a)
Personas.append(b)
Personas.append(c)
Personas.append(d)
for persona in Personas:
    print(persona['nombre'], persona['Edad'])


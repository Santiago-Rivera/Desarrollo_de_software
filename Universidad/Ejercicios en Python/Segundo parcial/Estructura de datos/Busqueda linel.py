def busqueda_lineal_equipos(equipos, jugador):

    for equipo in equipos:
        if jugador.lower() in (j.lower() for j in equipo["jugadores"]):  # Búsqueda insensible a mayúsculas
            return f"{jugador} juega en el equipo {equipo['equipo']}."
    return f"{jugador} no se encuentra en la lista de jugadores."

# Lista de equipos y jugadores
equipos_futbol = [
    {"equipo": "Real Madrid", "jugadores": ["Benzema", "Vinicius", "Modric"]},
    {"equipo": "Barcelona", "jugadores": ["Lewandowski", "Pedri", "Fati"]},
    {"equipo": "PSG", "jugadores": ["Mbappe", "Neymar", "Messi"]},
    {"equipo": "Manchester City", "jugadores": ["Haaland", "De Bruyne", "Grealish"]},
]

# Solicitar al usuario el nombre del jugador
jugador_buscado = input("Ingrese el nombre del jugador que desea buscar: ")

# Llamar a la función y mostrar el resultado
resultado = busqueda_lineal_equipos(equipos_futbol, jugador_buscado)
print(resultado)

import networkx as nx
import matplotlib.pyplot as plt

def crear_red_social():
    """
    Crea un grafo para modelar una red social donde los usuarios son nodos
    y las relaciones son aristas.
    """
    # Crear un grafo dirigido para permitir relaciones unidireccionales
    red_social = nx.DiGraph()

    # Agregar nodos (usuarios)
    red_social.add_nodes_from([
        ("usuario_1", {"nombre": "Ana", "edad": 25}),
        ("usuario_2", {"nombre": "Carlos", "edad": 30}),
        ("usuario_3", {"nombre": "Lucía", "edad": 28}),
        ("usuario_4", {"nombre": "Mario", "edad": 22}),
    ])

    # Agregar aristas (relaciones) con atributos
    red_social.add_edges_from([
        ("usuario_1", "usuario_2", {"tipo": "amistad", "peso": 1}),
        ("usuario_2", "usuario_3", {"tipo": "seguimiento", "peso": 2}),
        ("usuario_3", "usuario_1", {"tipo": "amistad", "peso": 1}),
        ("usuario_4", "usuario_2", {"tipo": "seguimiento", "peso": 3}),
    ])

    return red_social

def visualizar_red_social(red_social):
    """
    Genera una representación visual del grafo usando Matplotlib.
    """
    import matplotlib.pyplot as plt

    plt.figure(figsize=(10, 8))
    pos = nx.spring_layout(red_social)
    nx.draw(red_social, pos, with_labels=True, node_color='skyblue', edge_color='gray',
            node_size=2000, font_size=10, font_color='black')
    labels = nx.get_edge_attributes(red_social, 'tipo')
    nx.draw_networkx_edge_labels(red_social, pos, edge_labels=labels)
    plt.title("Red Social - Usuarios y Relaciones")
    plt.show()

def encontrar_camino_mas_corto(red_social, origen, destino):
    """
    Encuentra el camino más corto entre dos usuarios en términos de peso.
    """
    try:
        camino = nx.shortest_path(red_social, source=origen, target=destino, weight='peso')
        return camino
    except nx.NetworkXNoPath:
        return None

def main():
    red_social = crear_red_social()
    print("Usuarios en la red social:")
    for nodo, datos in red_social.nodes(data=True):
        print(f"{nodo}: {datos}")

    print("\nRelaciones en la red social:")
    for origen, destino, datos in red_social.edges(data=True):
        print(f"{origen} -> {destino}: {datos}")

    visualizar_red_social(red_social)

    origen = "usuario_1"
    destino = "usuario_3"
    print(f"\nCamino más corto entre {origen} y {destino}:")
    camino = encontrar_camino_mas_corto(red_social, origen, destino)
    if camino:
        print(" -> ".join(camino))
    else:
        print("No hay camino disponible entre los usuarios especificados.")

if __name__ == "__main__":
    main()
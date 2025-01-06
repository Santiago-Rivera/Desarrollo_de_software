class Cadena:
    def __init__(self, elementos):
        """ Inicializa la clase Cadena con una lista de elementos.
        :param elementos: Lista de cadenas a ser concatenadas :type elementos: list """ # Validar que los elementos sean una lista con al menos 4 elementos
        if not isinstance(elementos, list):
            raise TypeError("El argumento 'elementos' debe ser una lista.")
        if len(elementos) < 4:
            raise ValueError("Debe proporcionar al menos 4 elementos en la lista.")
        self.elementos = elementos
    def concatenar_normal(self):
        """ Concatenar los elementos de la lista usando un guion como separador :return: Cadena resultante concatenada
        :rtype: str """
        return " - ".join(self.elementos)
    def concatenar_con_estilos(self):
        """ Concatenar los elementos de la lista con un formato específico y con iconos como separadores.
        :return: Cadena concatenada con estilos
        :rtype: str """
        return f"{self.elementos[0]} ♥ {self.elementos[1]} ☀ {self.elementos[2]} ★ {self.elementos[3]}"
    def concatenar_invertido(self):
        """ Concatenar los elementos de la lista en orden inverso, separados por un pipe.
        :return: Cadena invertida
        :rtype: str """
        return " | ".join(reversed(self.elementos))
try:
    cadenas = Cadena(["Python", "es", "un", "lenguaje"]) 
    print("Concatenación normal: ", cadenas.concatenar_normal())  # Resultado esperado: Python - es - un - lenguaje
    print("Concatenación con f-string estilizada: ", cadenas.concatenar_con_estilos())  # Resultado esperado: Python ♥ es ☀ un ★ lenguaje
    print("Concatenación invertida: ", cadenas.concatenar_invertido())  # Resultado esperado: lenguaje | un | es | Python
except (TypeError, ValueError) as e:
    print(f"Error: {e}")
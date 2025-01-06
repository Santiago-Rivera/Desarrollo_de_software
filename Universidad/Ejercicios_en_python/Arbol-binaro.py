class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierdo = None
        self.derecho = None
class ArbolBinarioBusqueda:
    def __init__(self):
        self.raiz = None
    def insertar(self, valor):
        if self.raiz is None:
            self.raiz = Nodo(valor)
        else:
            self._insertar_recursivo(self.raiz, valor)
    def _insertar_recursivo(self, nodo_actual, valor):
        if valor < nodo_actual.valor:
            if nodo_actual.izquierdo is None:
                nodo_actual.izquierdo = Nodo(valor)
            else:
                self._insertar_recursivo(nodo_actual.izquierdo, valor)
        else:
            if nodo_actual.derecho is None:
                nodo_actual.derecho = Nodo(valor)
            else:
                self._insertar_recursivo(nodo_actual.derecho, valor)
    def buscar(self, valor):
        """Busca un valor en el árbol de búsqueda binario."""
        if not isinstance(valor, (int, float)):  # Ajusta según el tipo de datos esperado
            raise TypeError("El valor a buscar debe ser un número")
        return self._buscar_recursivo(self.raiz, valor)
    def _buscar_recursivo(self, nodo_actual, valor):
        """Busca recursivamente el valor en el árbol."""
        if nodo_actual is None:
            return False
        if valor == nodo_actual.valor:
            return True
        elif valor < nodo_actual.valor:
            return self._buscar_recursivo(nodo_actual.izquierdo, valor)
        else:
            return self._buscar_recursivo(nodo_actual.derecho, valor)
    def inorden(self):
        self._inorden_recursivo(self.raiz)
    def _inorden_recursivo(self, nodo_actual):
        if nodo_actual is not None:
            self._inorden_recursivo(nodo_actual.izquierdo)
            print(nodo_actual.valor, end=" ")
            self._inorden_recursivo(nodo_actual.derecho)
# Ejemplo de uso del Árbol Binario de Búsqueda
arbol = ArbolBinarioBusqueda()
# Insertamos valores en el árbol
valores = [50, 30, 70, 20, 40, 60, 80]
for valor in valores:
    arbol.insertar(valor)
    print("Recorrido inorden del árbol:")
    arbol.inorden()
# Buscar un valor en el árbol
print("\n\n¿El valor 40 está en el árbol?", arbol.buscar(40))
print("¿El valor 90 está en el árbol?", arbol.buscar(90))
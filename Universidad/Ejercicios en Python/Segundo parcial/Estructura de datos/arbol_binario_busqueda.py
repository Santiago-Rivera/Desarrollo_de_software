class NodoABB:
    def __init__(self, valor):
        self.valor = valor
        self.izquierdo = None
        self.derecho = None

class ArbolBinarioBusqueda:
    def __init__(self):
        self.raiz = None

    def insertar(self, valor):
        if self.raiz is None:
            self.raiz = NodoABB(valor)
        else:
            self._insertar_recursivo(self.raiz, valor)

    def _insertar_recursivo(self, nodo, valor):
        if valor < nodo.valor:
            if nodo.izquierdo is None:
                nodo.izquierdo = NodoABB(valor)
            else:
                self._insertar_recursivo(nodo.izquierdo, valor)
        elif valor > nodo.valor:
            if nodo.derecho is None:
                nodo.derecho = NodoABB(valor)
            else:
                self._insertar_recursivo(nodo.derecho, valor)

    def recorrido_inorden(self):
        """Devuelve los valores del árbol en orden ascendente."""
        return self._recorrido_inorden_recursivo(self.raiz)

    def _recorrido_inorden_recursivo(self, nodo):
        if nodo is None:
            return []
        return (self._recorrido_inorden_recursivo(nodo.izquierdo) + 
                [nodo.valor] + 
                self._recorrido_inorden_recursivo(nodo.derecho))
    
    def buscar(self, valor):
        """Busca un valor en el árbol y devuelve True si existe, False en caso contrario."""
        return self._buscar_recursivo(self.raiz, valor)

    def _buscar_recursivo(self, nodo, valor):
        if nodo is None:
            return False
        if nodo.valor == valor:
            return True
        elif valor < nodo.valor:
            return self._buscar_recursivo(nodo.izquierdo, valor)
        else:
            return self._buscar_recursivo(nodo.derecho, valor)

# Conjunto de valores
valores = [15, 10, 20, 8, 12, 17, 25]

# Crear el árbol e insertar los valores
abb = ArbolBinarioBusqueda()
for valor in valores:
    abb.insertar(valor)

# Mostrar el recorrido inorden (en orden ascendente)
print("Recorrido inorden del ABB:", abb.recorrido_inorden())

# Crear el árbol e insertar los valores
valores = [15, 10, 20, 8, 12, 17, 25]
abb = ArbolBinarioBusqueda()
for valor in valores:
    abb.insertar(valor)

# Buscar el valor 12
resultado = abb.buscar(12)
print(f"¿El valor 12 esta en el ABB? {'Si' if resultado else 'No'}")
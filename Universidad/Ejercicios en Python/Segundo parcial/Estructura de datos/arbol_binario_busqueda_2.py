class Nodo:
    def __init__(self, data):
        self.left = None
        self.right = None
        self.data = data
    def __str__(self):
        return str(self.data)
class ArbolBinarioBusqueda:
    def __init__(self):
        self.root = None
    def insertar(self, data):
        nodo = Nodo(data)
        if self.root is None:
            self.root = nodo
        else:
            self._insertar_recursivo(self.root, nodo)
    def _insertar_recursivo(self, nodo_actual, nodo_nuevo):
        if nodo_nuevo.data < nodo_actual.data:
            if nodo_actual.left is None:
                nodo_actual.left = nodo_nuevo
            else:
                self._insertar_recursivo(nodo_actual.left, nodo_nuevo)
        else:
            if nodo_actual.right is None:
                nodo_actual.right = nodo_nuevo
            else:
                self._insertar_recursivo(nodo_actual.right, nodo_nuevo)
    def buscar(self, valor):
        return self._buscar_recursivo(self.root, valor)
    def _buscar_recursivo(self, nodo, valor):
        if nodo is None:
            return False  # Valor no encontrado
        if valor == nodo.data:
            return True  # Valor encontrado
        elif valor < nodo.data:
            return self._buscar_recursivo(nodo.left, valor)
        else:
            return self._buscar_recursivo(nodo.right, valor)
    def imprimir_inorden(self):
        if self.root:
            self._imprimir_inorden_recursivo(self.root)
    def _imprimir_inorden_recursivo(self, nodo):
        if nodo:
            self._imprimir_inorden_recursivo(nodo.left)
            print(nodo.data, end=' ')
            self._imprimir_inorden_recursivo(nodo.right)
# Crear el árbol con los valores dados
arbol = ArbolBinarioBusqueda()
lista_valores = [50, 30, 20, 40, 70, 60, 80]
for valor in lista_valores:
    arbol.insertar(valor)
# Imprimir el árbol en orden (ascendente)
print("Impresión en orden:")
arbol.imprimir_inorden()
# Buscar un valor
valor_a_buscar = 40
if arbol.buscar(valor_a_buscar):
    print(f"El valor {valor_a_buscar} se encuentra en el árbol.")
else:
    print(f"El valor {valor_a_buscar} no se encuentra en el árbol.")
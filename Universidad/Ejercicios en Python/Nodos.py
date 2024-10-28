class NodoABB:
    def __init__(self, valor, resultado = None):
        self.valor = valor
        self.izquierda = None
        self.derecha = None
        self.resultado = resultado

    class ArbolDecision:
        def __init__(self):
            self.raiz = None

            def insertar (self, valor, resultado):
                if self.raiz is None:
                    self.raiz = NodoABB(valor, resultado)
                else:
                    self.insertar (self.raiz, valor, resultado)
                    
                    def _insertar (self, nodo, valor, resultado):
                        if valor <nodo.valor:
                            if nodo.izquierda is None:
                                nodo.izquierda = NodoABB (valor, resultado)
                            else:
                                self._insertar (nodo.derecha, valor , resultado)

                                def clasificar (self, nodo, valor): 
                                    if nodo is None:
                                        return None
                                    if valor == nodo.valor:
                                        return nodo.resultado
                                    elif valor < nodo.valor:
                                        return self.clasificar (nodo.izquierda, valor)
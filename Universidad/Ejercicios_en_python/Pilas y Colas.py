class Pila:
    def __init__(self):
        self.items = []
    def esta_vacia(self):
        return len(self.items) == 0
    def apilar(self, item):
        self.items.append(item)
    def desapilar(self):
        if not self.esta_vacia():
            return self.items.pop()
    def ver_tope(self):
        if not self.esta_vacia():
            return self.items[-1]
def es_balanceado(expresion):
    pila = Pila()
    pares = {')': '(', ']': '[', '}': '{'}  # Diccionario para encontrar pares
    for caracter in expresion:
        if caracter in "([{":  # Si es un paréntesis de apertura, apilar
            pila.apilar(caracter)
        elif caracter in ")]}":  # Si es un paréntesis de cierre
            if pila.esta_vacia() or pila.desapilar() != pares[caracter]:
                return False  # No está balanceado
    return pila.esta_vacia()  # Verificar si la pila quedó vacía al final
# Prueba del programa con una expresión matemática
expresion = input("Ingresa una expresión matemática: ")
if es_balanceado(expresion):
    print("La expresión está balanceada.")
else:
    print("La expresión NO está balanceada.")
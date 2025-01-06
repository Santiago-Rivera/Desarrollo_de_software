# Función para calcular el factorial de un número de forma recursiva
def factorial(n):
    if n < 0:
        raise ValueError("El factorial no está definido para números negativos.")
    # Caso base: cuando n es 0 o 1, el factorial es 1
    if n == 0 or n == 1:
        return 1
    # Paso recursivo: n * factorial(n - 1)
    return n * factorial(n - 1)

# Ejemplo de uso
try:
    print(factorial(5))  # Salida: 120
except ValueError as e:
    print(e)

# Función con propósito definido en lugar de la recursión infinita
def contar_hasta_n(n, limite=10):
    """
    Cuenta recursivamente desde n hasta el límite.
    Args:
        n (int): El valor inicial.
        limite (int): El límite superior de la cuenta.
    """
    if n > limite:
        return
    print(n)
    contar_hasta_n(n + 1, limite)

# Ejemplo de uso
contar_hasta_n(1, 5)  # Salida: 1 2 3 4 5
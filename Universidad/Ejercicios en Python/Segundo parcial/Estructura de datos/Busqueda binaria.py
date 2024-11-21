def busqueda_binaria(lista, valor):

    inicio = 0
    fin = len(lista) - 1

    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista[medio] == valor:
            return f"{valor} se encuentra en la posición {medio}."
        elif lista[medio] < valor:
            inicio = medio + 1
        else:
            fin = medio - 1

    return f"{valor} no se encuentra en la lista."

# Ejemplo de uso

# Lista ordenada para que la búsqueda binaria funcione correctamente
numeros = [1, 3, 5, 7, 9, 11, 13, 15]

# Solicitar al usuario el número a buscar
numero = int(input("Ingrese el número que desea buscar: "))

# Llamar a la función y mostrar el resultado
resultado = busqueda_binaria(numeros, numero)
print(resultado)
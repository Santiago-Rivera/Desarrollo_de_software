def invertir_cadena(cadena):
    if len(cadena) == 0:
        return ""
    return cadena[-1] + invertir_cadena(cadena[:-1])

# Prueba
entrada = "Santiago Rivera"
print(invertir_cadena(entrada))  # Salida esperada: "nóisrucer"

def suma_digitos(numero):
    if numero == 0:
        return 0
    return numero % 10 + suma_digitos(numero // 10)

# Prueba
entrada = 1234
print(suma_digitos(entrada))  # Salida esperada: 10

def maximo_lista(lista):
    if len(lista) == 1:
        return lista[0]
    max_resto = maximo_lista(lista[1:])
    return lista[0] if lista[0] > max_resto else max_resto

# Prueba
entrada = [4, 2, 7, 1, 9]
print(maximo_lista(entrada))  # Salida esperada: 9
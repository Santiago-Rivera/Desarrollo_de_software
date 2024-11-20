def sumar_tres_numeros(num1, num2, num3):

    # Verificamos que los números estén entre 1 y 10
        if 1 <= num1 <= 10 and 1 <= num2 <= 10 and 1 <= num3 <= 10:
            suma = num1 + num2 + num3
            print("El resultado es:", suma)
        else:
            print("Los números deben estar entre 1 y 10.")

# Ejemplo de uso:
sumar_tres_numeros(3, 5, 7)
# Crea un bucle while que se ejecute que x valga 15 con incremento de 5

x = 0

while x < 15:
    print(x)
    x += 5

# Crea un bucle while que se ejecute hasta que x valga 0 con decrementos de 1 y que muestre en cada ejecución esta frase con el valor de ejecución correspondiente: 'El valor del bucle es 10'

x = 10

while x > 0:
    print(f'El valor del bucle es {x}')
    x -= 1

# Crea un bucle for que itere la siguiente tupla y muestre una frase como esta en cada iteración: 'El color es: ' + color + '.'

colores = ("verde", "negro", "dorado", "azul", "morado", )

for color in colores:
    print(f'El color es: {colores}')
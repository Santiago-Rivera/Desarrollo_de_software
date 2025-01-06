# Actividad: Manipulación de cadenas en Python

# Paso 1: Crea una variable y asígnale el string con la frase "Estoy estudiando Python". Aquí inicializamos la variable `frase` con el texto proporcionado.
frase = "Estoy estudiando desarrollo de software"
print(f"Frase completa: {frase}")

# Paso 2: Utiliza slicing para imprimir el primer carácter de la cadena. Usamos el índice 0 para obtener el primer carácter de la cadena.
primer_caracter = frase[0]
print(f"Primer carácter de la frase: {primer_caracter}")

# Paso 3: Usa slicing para imprimir los 3 últimos caracteres de la cadena. Usamos índices negativos para acceder a los últimos caracteres.
ultimos_tres_caracteres = frase[-3:]
print(f"Últimos tres caracteres de la frase: {ultimos_tres_caracteres}")

# Paso 4: Imprime los caracteres de toda la frase, saltando uno cada vez. Utilizamos el operador de slicing con un paso de 2 para obtener los caracteres alternos.
caracteres_alternos = frase[::2]
print(f"Caracteres alternos (saltando de 2 en 2): {caracteres_alternos}")

# Paso 5: Muestra todos los caracteres, menos el último. Excluimos el último carácter usando slicing hasta el índice -1.
sin_el_ultimo = frase[:-1]
print(f"Frase sin el último carácter: {sin_el_ultimo}")

# Resumen del programa con una separación para mayor claridad en la salida.
print("\n=== Resumen de los resultados ===")
print(f"Frase original: {frase}")
print(f"Primer carácter: {primer_caracter}")
print(f"Últimos tres caracteres: {ultimos_tres_caracteres}")
print(f"Caracteres alternos: {caracteres_alternos}")
print(f"Frase sin el último carácter: {sin_el_ultimo}")
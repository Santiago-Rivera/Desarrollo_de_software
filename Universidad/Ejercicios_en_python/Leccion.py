a = 5
b = 4
c = 7
d = 3

expresiones = [
    "3 * a <= 15",
    "c - d == a + 2",
    "(5 * a + 3 * b) >= (c**d - 35)",  
    "(5 % c + 3 * b/d) < (c**d/3)",  
    "(32 % (4 * c) + 3 * (b + d)) < (c**(1 + a % 2))"  
]

for expresion in expresiones:
    # Usamos eval() para evaluar la expresión como código Python
    resultado = eval(expresion)
    print(expresion, resultado)
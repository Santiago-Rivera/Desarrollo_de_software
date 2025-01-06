a = 5
b = 4
c = 7
d = 3

# Expresiones a evaluar:
resultado_a = 3 * a <= 15
resultado_b = c - d == a + 2
resultado_c = (5 * a + 3 * b) >= (c**d - 35)
resultado_d = (5 % c + 3 * b/d) < (c**d/3)
resultado_e = (32 % (4 * c) + 3 * (b + d)) < (c**(1 + a % 2))
resultado_f = (5 * d + b != 4**d) or (c + d >= a/b)
resultado_g = (c * a + 10 > b * d - 6) and ((b + c) % 5 < a)
resultado_h = (c*(a + 10) > b*(8*d-6)) and ((b + c) % 5 < a)

# Imprimir los resultados:
print("a)", resultado_a)
print("b)", resultado_b)
print("c)", resultado_c)
print("d)", resultado_d)
print("e)", resultado_e)
print("f)", resultado_f)
print("g)", resultado_g)
print("h)", resultado_h)
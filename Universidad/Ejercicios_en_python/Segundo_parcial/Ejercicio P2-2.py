class Figura:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        raise NotImplementedError("Este método debe ser implementado por una subclase")

class Rectangulo(Figura):
    def __init__(self, base, altura):
        super().__init__(base, altura)

    def area(self):
        # Área del rectángulo: base * altura
        return self.base * self.altura

class Paralelogramo(Figura):
    def __init__(self, base, altura):
        super().__init__(base, altura)

    def area(self):
        # Área del paralelogramo: base * altura
        return self.base * self.altura

# Ejemplo de uso:
rectangulo = Rectangulo(base=8, altura=4)
paralelogramo = Paralelogramo(base=6, altura=3)

# Mostramos el resultado del cálculo del área
print(f"El area del rectangulo es: {rectangulo.area()}")  # Resultado: 32
print(f"El area del paralelogramo es: {paralelogramo.area()}")  # Resultado: 18
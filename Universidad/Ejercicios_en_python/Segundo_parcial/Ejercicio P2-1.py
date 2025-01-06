class Figura:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        raise NotImplementedError("Este método debe ser implementado por una subclase")


class Triangulo(Figura):
    def __init__(self, base, altura):
        super().__init__(base, altura)

    def area(self):
        return (self.base * self.altura) / 2


# Ejemplo de uso
triangulo = Triangulo(base=10, altura=5)
print(f"El area del triangulo es: {triangulo.area()}")  # Resultado: 25.0

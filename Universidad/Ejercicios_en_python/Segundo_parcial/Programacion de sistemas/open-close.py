class DataFilter:
    def filter(self, data):
        raise NotImplementedError("Este método debe ser implementado por subclases")

# Aplicamos el principio abierto/cerrado definiendo subclases para diferentes criterios de filtro
class EvenNumberFilter(DataFilter):
    def filter(self, data):
        return [item for item in data if item % 2 == 0]

class OddNumberFilter(DataFilter):
    def filter(self, data):
        return [item for item in data if item % 2 != 0]

class GreaterThanFilter(DataFilter):
    def __init__(self, threshold):
        self.threshold = threshold

    def filter(self, data):
        return [item for item in data if item > self.threshold]

# Funcionalidad principal
if __name__ == "__main__":
    data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    even_filter = EvenNumberFilter()
    odd_filter = OddNumberFilter()
    greater_than_filter = GreaterThanFilter(5)

    print("Datos originales:", data)
    print("Numeros pares:", even_filter.filter(data))
    print("Numeros impares:", odd_filter.filter(data))
    print("Numeros mayores que 5:", greater_than_filter.filter(data))
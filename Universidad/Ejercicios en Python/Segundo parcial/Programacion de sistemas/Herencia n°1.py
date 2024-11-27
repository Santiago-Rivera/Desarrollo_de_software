# Clase base: Animal
class Animal:
    def __init__(self, especie, edad, peso):
        self.especie = especie
        self.edad = edad
        self.peso = peso

    def mostrar_info(self):
        return f"Especie: {self.especie}, Edad: {self.edad} años, Peso: {self.peso} kg"

# Clase derivada: Dog
class Dog(Animal):
    def __init__(self, especie, edad, peso, nombre, raza):
        super().__init__(especie, edad, peso)
        self.nombre = nombre
        self.raza = raza

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return f"{info_base}, Nombre: {self.nombre}, Raza: {self.raza}"

# Ejemplo de uso
if __name__ == "__main__":
    # Crear un objeto de la clase Dog
    mi_perro = Dog("Canino", 5, 20, "Max", "Labrador")
    
    # Mostrar información del objeto
    print(mi_perro.mostrar_info())
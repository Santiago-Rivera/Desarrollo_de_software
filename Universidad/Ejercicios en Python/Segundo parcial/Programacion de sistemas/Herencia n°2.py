# Clase Persona
class Persona:
    def __init__(self, nombre, edad, numero_telefonico):
        self.nombre = nombre
        self.edad = edad
        self.numero_telefonico = numero_telefonico

    def mostrar_mensaje(self):
        return (f"Hola, mi nombre es {self.nombre}, "
                f"tengo {self.edad} años, "
                f"mi número telefónico es {self.numero_telefonico}.")

# Ejemplo de uso
if __name__ == "__main__":
    # Crear una instancia de la clase Persona
    persona = Persona("Juan Pérez", 30, "099-530-303-3")
    
    # Mostrar el mensaje
    print(persona.mostrar_mensaje())
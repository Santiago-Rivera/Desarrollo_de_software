# Ejercicio 1

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]  # Crear una tabla con listas vacías para manejar colisiones

    def hash_function(self, key):
        return sum(ord(char) for char in key) % self.size

    def insert(self, key):
        index = self.hash_function(key)
        self.table[index].append(key)  # Agregar la clave a la lista correspondiente al índice

    def display(self):
        for i, bucket in enumerate(self.table):
            print(f"Índice {i}: {bucket}")

# Crear la tabla hash con tamaño 7
table = HashTable(7)

# Claves a insertar
keys = ["auto", "moto", "avión", "tren", "bici", "barco", "coche"]

# Insertar las claves en la tabla hash
for key in keys:
    table.insert(key)

# Mostrar el estado final de la tabla hash
table.display()

# Ejercicio 2

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]  # Crear una tabla con listas vacías para manejar colisiones

    def hash_function(self, key):
        return sum(ord(char) for char in key) % self.size

    def insert(self, key):
        index = self.hash_function(key)
        self.table[index].append(key)  # Agregar la clave a la lista correspondiente al índice

    def display(self):
        for i, bucket in enumerate(self.table):
            print(f"Índice {i}: {bucket}")

# Crear la tabla hash con tamaño 10
table = HashTable(10)

# Claves a insertar
keys = ["casa", "mesa", "silla", "puerta", "ventana"]

# Insertar las claves en la tabla hash
for key in keys:
    table.insert(key)

# Mostrar el estado final de la tabla hash
table.display()

# Ejercicio 3

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]  # Crear una tabla con listas vacías para manejar colisiones

    def hash_function(self, key):
        return sum(ord(char) for char in key) % self.size

    def insert(self, key):
        index = self.hash_function(key)
        self.table[index].append(key)  # Agregar la clave a la lista correspondiente al índice

    def search(self, key):
        index = self.hash_function(key)
        bucket = self.table[index]
        if key in bucket:
            return f"Clave '{key}' encontrada en el índice {index}."
        else:
            return f"Clave '{key}' no encontrada."

    def delete(self, key):
        index = self.hash_function(key)
        bucket = self.table[index]
        if key in bucket:
            bucket.remove(key)
            print(f"Clave '{key}' eliminada.")
        else:
            print(f"Clave '{key}' no encontrada para eliminar.")

    def display(self):
        for i, bucket in enumerate(self.table):
            print(f"Índice {i}: {bucket}")

# Crear la tabla hash con tamaño 7
table = HashTable(7)

# Claves a insertar
keys = ["auto", "moto", "avión", "tren", "bici", "barco", "coche"]

# Insertar las claves en la tabla hash
for key in keys:
    table.insert(key)

# Mostrar el estado inicial de la tabla hash
table.display()

# Buscar las claves "tren" y "submarino"
print(table.search("tren"))
print(table.search("submarino"))

# Eliminar la clave "avión"
table.delete("avión")

# Mostrar el estado final de la tabla hash
table.display()
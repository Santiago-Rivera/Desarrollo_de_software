class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
class BinarySearchTree:
    def __init__(self):
        self.root = None
    def insert(self, root, key):
        if root is None:
            return Node(key)
        if key < root.key:
            root.left = self.insert(root.left, key)
        elif key > root.key:
            root.right = self.insert(root.right, key)
        return root
    def search(self, root, key):
        if root is None or root.key == key:
            return root
        if key < root.key:
            return self.search(root.left, key)
        return self.search(root.right, key)
    def find_min(self, root):
        current = root
        while current and current.left:
            current = current.left
        return current
    def find_max(self, root):
        current = root
        while current and current.right:
            current = current.right
        return current
    def delete(self, root, key):
        if root is None:
            return root
        if key < root.key:
            root.left = self.delete(root.left, key)
        elif key > root.key:
            root.right = self.delete(root.right, key)
        else:
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left
            temp = self.find_min(root.right)
            root.key = temp.key
            root.right = self.delete(root.right, temp.key)
        return root
    def inorder(self, root):
        if root:
            self.inorder(root.left)
            print(root.key, end=" ")
            self.inorder(root.right)
# Crear el árbol binario de búsqueda
bst = BinarySearchTree()
root = None
values = [50, 30, 70, 40, 60, 80, 90]
for value in values:
    root = bst.insert(root, value)
# Realizar operaciones
print("Inorden del arbol:")
bst.inorder(root)
# Buscar un valor
key_to_search = 60
result = bst.search(root, key_to_search)
if result:
    print(f"\nValor {key_to_search} encontrado en el árbol.")
else:
    print(f"\nValor {key_to_search} no encontrado en el árbol.")
# Encontrar el valor mínimo y máximo
min_node = bst.find_min(root)
max_node = bst.find_max(root)
if min_node:
    print(f"Valor minimo: {min_node.key}")
else:
    print("El arbol está vacio, no hay valor minimo.")

if max_node:
    print(f"Valor maximo: {max_node.key}")
else:
    print("El arbol está vacio, no hay valor maximo.")
# Eliminar un nodo
key_to_delete = 70
root = bst.delete(root, key_to_delete)
print(f"Inorden despues de eliminar {key_to_delete}:")
bst.inorder(root)
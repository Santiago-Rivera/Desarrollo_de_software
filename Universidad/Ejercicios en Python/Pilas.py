class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            return None

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            return None

    def is_empty(self):
        return self.items == []

# Ejemplo de uso:
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
print(stack.pop())  # Imprime 3
print(stack.peek())  # Imprime 2
class Queue:
    def __init__(self):
        self.items = []

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.items.pop(0)
        else:
            return None

    def peek(self):
        if not self.is_empty():
            return self.items[0]
        else:
            return None

    def is_empty(self):
        return self.items == []

# Ejemplo de uso:
queue = Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print(queue.dequeue())  # Imprime 1
print(queue.peek())  # Imprime 2
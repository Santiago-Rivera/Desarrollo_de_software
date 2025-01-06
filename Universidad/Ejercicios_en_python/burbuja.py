def burbuja(lista):
  n = len(lista)

  # Traverse through all array elements
  for i in range(n):

    # Last i elements are already in place
    for j in range(0, n-i-1):

      # Traverse the array from 0 to n-i-1
      # Swap if the element found is greater
      # than the next element
      if lista[j] > lista[j+1] :
        lista[j], lista[j+1] = lista[j+1], lista[j]

# Lista de números a ordenar
lista = [64, 34, 25, 12, 22, 11, 90]

burbuja(lista)

print ("Lista ordenada:")
for i in range(len(lista)):
    print ("% d" %lista[i],end=" ")
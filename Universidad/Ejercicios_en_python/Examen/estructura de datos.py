def check_balanced(expression):
    stack = []
    opening_brackets = '({['
    closing_brackets = ')}]'
    for char in expression:
        if char in opening_brackets:
            stack.append(char)
        elif char in closing_brackets:
            if not stack:
                return False
            top = stack.pop()
            if opening_brackets.index(top) != closing_brackets.index(char):
                return False
    return not stack

# Ejemplo de uso:
expression1 = "((2 + 3) * (5 - 2))"
expression2 = "(2 + 3) * (5 - 2))("

print(check_balanced(expression1))  # Output: True
print(check_balanced(expression2))  # Output: False
# Aula 07 - Operadores sobrecarregados definidos pelo usuário (Sebesta 7.3, p. 309; 9.11, p. 404)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python vetor.py
class Vetor:
    def __init__(self, x, y):
        self.x, self.y = x, y

    def __add__(self, outro):          # v1 + v2
        return Vetor(self.x + outro.x, self.y + outro.y)

    def __mul__(self, k):              # v * 3
        return Vetor(self.x * k, self.y * k)

    def __eq__(self, outro):           # v1 == v2
        return (self.x, self.y) == (outro.x, outro.y)

    def __repr__(self):
        return f"Vetor({self.x}, {self.y})"


v = Vetor(1, 2) + Vetor(3, 4)
print(v)                   # Vetor(4, 6)
print(v * 3)               # Vetor(12, 18)
print(v == Vetor(4, 6))    # True
print([1, 2] + [3])        # o + também concatena listas
print("ab" * 3)            # e o * repete cadeias

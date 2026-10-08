# Aula 09 - Herança múltipla e o problema do diamante (Sebesta 12.3.3, p. 495-496)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python diamante.py
class A:
    def quem(self):
        return "A"


class B(A):
    def quem(self):
        return "B"


class C(A):
    def quem(self):
        return "C"


class D(B, C):             # herança MÚLTIPLA em forma de diamante
    pass


print(D().quem())                          # B
print([c.__name__ for c in D.__mro__])     # ['D', 'B', 'C', 'A', 'object']: ordem de resolução (MRO)


class E(C, B):
    pass


print(E().quem())                          # C: trocar a ordem dos pais muda o resultado!

# Aula 09 - O TAD pilha em Python: privacidade por convenção (Sebesta 11.2-11.4)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python pilha.py
class Pilha:
    def __init__(self):
        self._dados = []           # "_": privado só por CONVENÇÃO

    def empilhar(self, x):
        self._dados.append(x)

    def desempilhar(self):
        if self.vazia():
            raise IndexError("pilha vazia")
        return self._dados.pop()

    def topo(self):
        return self._dados[-1]

    def vazia(self):
        return not self._dados


p = Pilha()
p.empilhar(42)
p.empilhar(29)
print("29 is:", p.topo())
p.desempilhar()
print("42 is:", p.topo())
p._dados.insert(0, 999)        # nada impede: Python confia no programador
print(p._dados)                # [999, 42]


class Conta:
    def __init__(self):
        self.__saldo = 0       # "__": o nome é alterado internamente (name mangling)


c = Conta()
# print(c.__saldo)             # AttributeError
print(c._Conta__saldo)         # 0: continua acessível, só ficou mais difícil

# Exercício Aula 09 - Questão 4: qual é a saída? Por quê?
# Online: https://onecompiler.com/python  (cole o código inteiro)
class Contador:
    total = 0

    def __init__(self):
        Contador.total += 1
        self.id = Contador.total


a = Contador()
b = Contador()
print(a.id, b.id, a.total)

# Autopesquisa - Reflexão em Python (Sebesta 12.6, p. 529-540)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python reflexao.py
class Pessoa:
    def __init__(self):
        self.nome = "Ana"

    def saudar(self, outro):
        return f"{self.nome} cumprimenta {outro}"


p = Pessoa()
print(type(p).__name__)                               # Pessoa
print([m for m in dir(p) if not m.startswith("_")])   # ['nome', 'saudar']
metodo = getattr(p, "saudar")                         # busca o método pelo NOME
print(metodo("Bia"))                                  # Ana cumprimenta Bia
setattr(p, "idade", 20)                               # cria um atributo em execução
print(vars(p))                                        # {'nome': 'Ana', 'idade': 20}

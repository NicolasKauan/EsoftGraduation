# Autopesquisa - Tuplas (Sebesta 6.8, p. 266) e Listas (Sebesta 6.9, p. 268)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python tuplas.py
from collections import namedtuple

ponto = (3, 4)
x, y = ponto                      # desestruturação
print(x, y, ponto[0])
try:
    ponto[0] = 10
except TypeError as e:
    print("tupla é imutável:", e)

Ponto = namedtuple("Ponto", "x y")  # tupla com campos nomeados (quase um registro)
p = Ponto(3, 4)
print(p.x, p)

lista = [1, "dois", 3.0]              # lista heterogênea
quadrados = [n * n for n in range(5)] # compreensão de lista (herança de Haskell)
print(lista, quadrados)

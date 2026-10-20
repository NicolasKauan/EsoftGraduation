# Aula 12 - Programação funcional em Python (Sebesta 15.10, p. 676)
# Online: https://onecompiler.com/python  (cole o código inteiro)
from functools import partial, reduce
from itertools import count, islice, takewhile
from operator import add

# Lambda (p. 676)
f = lambda a, b: 2 * a - b
print(f(5, 3))                                        # 7

# O map do livro (p. 676). Em Python 3, map é PREGUIÇOSO: devolve um iterador, e não a lista
m = map(lambda x: x ** 3, [2, 4, 6, 8])
print(m)                                              # <map object at 0x...>
print(list(m))                                        # [8, 64, 216, 512]

# filter e compreensões de lista
print(list(filter(lambda x: x % 2 == 0, range(10))))  # [0, 2, 4, 6, 8]
print([x ** 3 for x in [2, 4, 6, 8] if x > 3])        # [64, 216, 512]

# Aplicação parcial (p. 676). O livro omite a linha "from functools import partial"
add5 = partial(add, 5)
print(add5(15))                                       # 20

# Redução
print(reduce(lambda acc, x: acc * x, range(1, 11), 1))   # 3628800

# Geradores: sequências infinitas e preguiçosas
quadrados = (n * n for n in count(0))
print(list(takewhile(lambda q: q < 50, quadrados)))   # [0, 1, 4, 9, 16, 25, 36, 49]
print(list(islice(count(0, 7), 5)))                   # [0, 7, 14, 21, 28]

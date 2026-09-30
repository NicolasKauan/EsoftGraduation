# Aula 08 - Subprogramas como parâmetros: integração numérica (Sebesta 9.6, p. 391)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python integracao.py
import math


def integrar(f, a, b, n=1000):     # f é um parâmetro que é um SUBPROGRAMA
    """Regra do trapézio: amostra f em n pontos entre a e b."""
    h = (b - a) / n
    soma = (f(a) + f(b)) / 2
    for i in range(1, n):
        soma += f(a + i * h)
    return soma * h


print(round(integrar(math.sin, 0, math.pi), 4))     # 2.0
print(round(integrar(lambda x: x * x, 0, 3), 4))    # 9.0 (função anônima)

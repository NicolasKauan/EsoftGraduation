# Aula 12 - Funções matemáticas, transparência referencial e formas funcionais
# (Sebesta 15.2 e 15.3, p. 633-637)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python puras.py
from functools import reduce

# 1) Função IMPURA: o resultado depende de um estado externo que muda
contador = 0

def proximo_id(prefixo):
    global contador
    contador += 1                       # efeito colateral: altera o estado
    return f"{prefixo}-{contador}"

print(proximo_id("A"), proximo_id("A"))  # A-1 A-2: mesma entrada, resultados diferentes

# 2) Função PURA: depende só dos parâmetros e não altera nada
def cubo(x):
    return x * x * x

# transparência referencial (p. 636): cubo(2) pode ser trocado por 8 em qualquer lugar
print(cubo(2) + cubo(2) == 2 * cubo(2) == 16)   # True

# 3) Expressão lambda (p. 635): (λ(x) x * x * x)(2) = 8
print((lambda x: x * x * x)(2))

# 4) Composição (p. 635): h = f ∘ g, ou seja, h(x) = f(g(x))
def compor(f, g):
    return lambda x: f(g(x))

f = lambda x: x + 2
g = lambda x: 3 * x
h = compor(f, g)
print(h(4))                              # f(g(4)) = f(12) = 14

# 5) Aplicar-a-todos (p. 636): α(h, (2, 3, 4)) = (4, 9, 16), com h(x) = x * x
quadrado = lambda x: x * x
print(list(map(quadrado, (2, 3, 4))))    # [4, 9, 16]

# 6) Redução: combina todos os elementos em um só valor
print(reduce(lambda acc, x: acc + x, [1, 2, 3, 4], 0))   # 10

# 7) Mutação × valor novo
notas = [7, 3, 9]
ordenadas = sorted(notas)                # devolve uma lista NOVA
print(notas, ordenadas)                  # [7, 3, 9] [3, 7, 9]
notas.sort()                             # altera a lista original (efeito colateral)
print(notas)                             # [3, 7, 9]

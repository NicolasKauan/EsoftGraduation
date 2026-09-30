# Aula 07 - Precedência e associatividade (Sebesta 7.2.1, p. 301-305)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python precedencia.py
a, b, c = 3, 4, 5
print("a + b * c     =", a + b * c)        # 23: * tem precedência maior (p. 301)
print("(a + b) * c   =", (a + b) * c)      # 35: parênteses mudam a ordem (p. 305)

# ** tem precedência MAIOR que o menos unário
print("-2 ** 2       =", -2 ** 2)          # -4, e não 4
print("(-2) ** 2     =", (-2) ** 2)        # 4

# ** associa à DIREITA (como em Fortran e Ruby, p. 303)
print("2 ** 3 ** 2   =", 2 ** 3 ** 2)      # 512 = 2 ** 9
print("(2 ** 3) ** 2 =", (2 ** 3) ** 2)    # 64

# - associa à ESQUERDA
print("10 - 4 - 3    =", 10 - 4 - 3)       # 3 = (10 - 4) - 3

# Divisão e resto: Python arredonda para BAIXO (Java e C truncam em direção a zero)
print("-7 // 2 =", -7 // 2, "  -7 % 2 =", -7 % 2)   # -4 1

# Aula 06 - Tipos de dados primitivos: inteiros (Sebesta 6.2.1.1, p. 236)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python inteiros.py
# Em Python o int tem precisão arbitrária: não existe estouro.
import math
import sys

x = 2**31 - 1
print("2**31 - 1 + 1 =", x + 1)
print("2**100        =", 2**100)
print("30!           =", math.factorial(30))
print("bits de 30!   =", math.factorial(30).bit_length())
# sys.maxsize limita índices de listas, não o valor de um int
print("sys.maxsize   =", sys.maxsize)

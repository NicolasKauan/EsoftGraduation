# Aula 06 - Ponto flutuante x decimal (Sebesta 6.2.1.2 e 6.2.1.4, p. 237-238)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python flutuante.py
import math
from decimal import Decimal

print("0.1 + 0.2        =", 0.1 + 0.2)
soma = 0.0
for _ in range(10):
    soma += 0.1
print("laço 10 x 0.1    =", soma)             # 0.9999999999999999
# Curiosidade: desde o Python 3.12, sum() usa soma compensada e devolve 1.0
print("sum([0.1] * 10)  =", sum([0.1] * 10))
print("math.isclose     =", math.isclose(0.1 + 0.2, 0.3))

print("Decimal          =", Decimal("0.1") + Decimal("0.2"))
print("Decimal(0.1)     =", Decimal(0.1))  # herda o erro do float

# Míssil Patriot (Dhahran, 1991): o relógio contava décimos de segundo,
# e 0,1 era guardado TRUNCADO num registrador de 24 bits.
decimo_truncado = 0.099999904632568359375
erro_por_tique = 0.1 - decimo_truncado
tiques_em_100h = 100 * 60 * 60 * 10
deriva = erro_por_tique * tiques_em_100h
print(f"erro por tique   = {erro_por_tique:.3e} s")
print(f"deriva em 100 h  = {deriva:.4f} s")
print(f"um Scud a ~1676 m/s anda {deriva * 1676:.0f} m nesse tempo")

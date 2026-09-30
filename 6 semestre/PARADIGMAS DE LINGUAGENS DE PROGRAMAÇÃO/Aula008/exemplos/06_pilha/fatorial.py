# Aula 08 - Recursão e a pilha de execução (Sebesta 10.3.3, p. 425-427)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python fatorial.py
# Visualize passo a passo em https://pythontutor.com
import sys


def fatorial(n, nivel=0):
    print("  " * nivel + f"fatorial({n}) chamada")
    r = 1 if n <= 1 else n * fatorial(n - 1, nivel + 1)
    print("  " * nivel + f"fatorial({n}) retorna {r}")
    return r


fatorial(3)


def sem_fim(n):
    return sem_fim(n + 1)      # recursão sem caso base


print("limite de recursão:", sys.getrecursionlimit())
try:
    sem_fim(0)
except RecursionError as e:
    print("RecursionError:", e)

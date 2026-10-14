# Aula 10 - As quatro respostas possíveis da Figura 13.1 (Sebesta 13.2.1, p. 548)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python corrida_total.py
# A tarefa A faz TOTAL += 1 e a tarefa B faz TOTAL *= 2, com TOTAL = 3 no início.
# Cada uma executa 3 passos: 1) obter TOTAL  2) operar  3) gravar TOTAL.
from itertools import combinations


def executa(ordem):
    total = 3
    reg = {"A": None, "B": None}      # o "registrador" de cada tarefa
    passo = {"A": 0, "B": 0}
    for t in ordem:
        if passo[t] == 0:
            reg[t] = total                                   # 1. obter o valor de TOTAL
        elif passo[t] == 1:
            reg[t] = reg[t] + 1 if t == "A" else reg[t] * 2  # 2. fazer a conta
        else:
            total = reg[t]                                   # 3. gravar de volta
        passo[t] += 1
    return total


resultados = {}
for pos in combinations(range(6), 3):        # todas as intercalações dos 6 passos
    ordem = "".join("A" if i in pos else "B" for i in range(6))
    resultados.setdefault(executa(ordem), []).append(ordem)

for valor in sorted(resultados):
    n = len(resultados[valor])
    rotulo = "intercalação " if n == 1 else "intercalações"
    print(f"TOTAL = {valor}: {n:2d} {rotulo}, por exemplo {resultados[valor][0]}")
# Só 8 (A inteira antes de B) está "correto": 4, 6 e 7 vêm de intercalações

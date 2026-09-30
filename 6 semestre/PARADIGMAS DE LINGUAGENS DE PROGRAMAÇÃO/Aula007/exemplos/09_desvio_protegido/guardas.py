# Aula 07 - Comandos protegidos de Dijkstra (Sebesta 8.5, p. 353-355)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python guardas.py
# Simula o laço "do ... od" do livro (p. 355) que ordena q1 <= q2 <= q3 <= q4:
# a cada volta avaliamos TODAS as guardas e escolhemos ao acaso uma verdadeira.
import random

q = [9, 4, 7, 1]
passos = []
while True:
    guardas = [i for i in range(3) if q[i] > q[i + 1]]   # guardas verdadeiras
    if not guardas:                                       # todas falsas: o laço termina
        break
    i = random.choice(guardas)                            # escolha NÃO determinística
    q[i], q[i + 1] = q[i + 1], q[i]
    passos.append(f"troca q{i + 1}/q{i + 2}")

print(" -> ".join(passos))   # a sequência de trocas muda a cada execução...
print(q)                     # ...mas o resultado é sempre [1, 4, 7, 9]

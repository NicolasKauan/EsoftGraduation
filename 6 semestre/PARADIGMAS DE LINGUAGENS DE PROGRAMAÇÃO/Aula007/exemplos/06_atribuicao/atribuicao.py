# Aula 07 - Atribuição em Python (Sebesta 7.7, p. 317-321)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python atribuicao.py
a, b = 1, 2
a, b = b, a                  # atribuição múltipla: troca sem variável temporária (p. 320)
print(a, b)                  # 2 1

x = y = 0                    # múltiplos alvos
primeiro, *resto = [10, 20, 30]
print(primeiro, resto)       # 10 [20, 30]

# Atribuição NÃO é expressão em Python:
# if n = 10: ...             # ERRO de sintaxe
# ...exceto com o operador "morsa" := (Python 3.8+)
dados = [3, 1, 4, 1, 5, 9]
if (n := len(dados)) > 5:
    print(f"lista longa: {n} elementos")

total = 10
total += 5                   # atribuição composta
total //= 2
print(total)                 # 7

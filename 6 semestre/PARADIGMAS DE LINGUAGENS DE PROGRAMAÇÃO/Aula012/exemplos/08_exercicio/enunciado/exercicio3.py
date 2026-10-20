# Aula 12 - Exercício 3: reescreva o laço como uma compreensão de lista
# Online: https://onecompiler.com/python  (cole o código inteiro)
precos = [50.0, 120.0, 80.0, 200.0]
com_desconto = []
for p in precos:
    if p > 100:
        com_desconto.append(p * 0.9)
    else:
        com_desconto.append(p)
print(com_desconto)

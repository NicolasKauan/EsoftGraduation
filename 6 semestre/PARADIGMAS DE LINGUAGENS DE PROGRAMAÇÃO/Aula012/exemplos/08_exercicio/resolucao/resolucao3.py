# Aula 12 - Exercício 3: resolução
# Online: https://onecompiler.com/python  (cole o código inteiro)
precos = [50.0, 120.0, 80.0, 200.0]

com_desconto = []                                          # imperativo
for p in precos:
    if p > 100:
        com_desconto.append(p * 0.9)
    else:
        com_desconto.append(p)

com_desconto2 = [p * 0.9 if p > 100 else p for p in precos]            # compreensão
com_desconto3 = list(map(lambda p: p * 0.9 if p > 100 else p, precos))  # map + lambda

print(com_desconto)     # [50.0, 108.0, 80.0, 180.0]
print(com_desconto2)    # [50.0, 108.0, 80.0, 180.0]
print(com_desconto3)    # [50.0, 108.0, 80.0, 180.0]

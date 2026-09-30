# Exercício Aula 08 - Questão 3: qual é a saída? Por quê?
# Online: https://onecompiler.com/python  (cole o código inteiro)
fs = [lambda: i for i in range(3)]
print([f() for f in fs])

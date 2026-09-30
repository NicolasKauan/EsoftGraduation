# Exercício Aula 07 - Questão 2: qual é a saída? Onde está o bug?
# Online: https://onecompiler.com/python  (cole o código inteiro)
def desconto(preco, d=None):
    d = d or 10     # padrão: 10%
    return preco * (100 - d) / 100

print(desconto(200, 0))

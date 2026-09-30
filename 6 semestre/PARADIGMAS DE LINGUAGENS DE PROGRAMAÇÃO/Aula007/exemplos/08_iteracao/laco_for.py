# Aula 07 - O for de Python (Sebesta 8.3.1.3, p. 344-345)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python laco_for.py
for i in range(0, 10):
    print(i, end=" ")
    i += 2              # NÃO muda a contagem: o range entrega o próximo valor
print()                 # 0 1 2 3 4 5 6 7 8 9

for i in range(10, 0, -3):    # início, fim (exclusivo), passo
    print(i, end=" ")         # 10 7 4 1
print()

for posicao, nome in enumerate(["ana", "bia"]):
    print(posicao, nome)

print("depois do laço, i =", i)   # 1: a variável continua existindo

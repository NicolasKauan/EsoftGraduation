# Aula 08 - Python e Ruby: "passagem por atribuição" (Sebesta 9.5.4, p. 384)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python passagem.py
def altera_lista(lista):
    lista.append(4)          # altera o objeto compartilhado: o chamador vê


def reatribui_lista(lista):
    lista = [0, 0, 0]        # só muda o nome LOCAL: o chamador não vê


def incrementa(n):
    n = n + 1                # int é imutável: cria outro objeto e liga o nome local a ele


nums = [1, 2, 3]
altera_lista(nums)
print(nums)                  # [1, 2, 3, 4]
reatribui_lista(nums)
print(nums)                  # [1, 2, 3, 4]

x = 10
incrementa(x)
print(x)                     # 10

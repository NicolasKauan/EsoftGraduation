# Aula 08 - Fechamentos em Python (Sebesta 9.12, p. 404-406)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python fechamentos.py
def fazer_multiplicador(k):
    def multiplica(x):
        return k * x           # k vem do ambiente onde multiplica foi DEFINIDA
    return multiplica


dobro = fazer_multiplicador(2)
triplo = fazer_multiplicador(3)
print(dobro(5), triplo(5))     # 10 15


def criar_contador():
    n = 0

    def incrementa():
        nonlocal n             # sem nonlocal: UnboundLocalError
        n += 1
        return n
    return incrementa


c = criar_contador()
c()
c()
print(c())                                     # 3
print(dobro.__closure__[0].cell_contents)      # 2: o ambiente guardado dentro do fechamento

# Autopesquisa - Corrotinas (Sebesta 9.13, p. 406-412): os geradores de Python
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python geradores.py
def produtor():
    for i in range(3):
        print(f"produtor: enviando {i}")
        yield i                     # suspende aqui e devolve o controle ao consumidor
        print(f"produtor: retomado depois de {i}")


for valor in produtor():
    print(f"consumidor: recebeu {valor}")


def acumulador():                   # corrotina que RECEBE valores com send()
    total = 0
    while True:
        x = yield total
        total += x


acc = acumulador()
next(acc)                           # avança até o primeiro yield
print(acc.send(10), acc.send(5))    # 10 15

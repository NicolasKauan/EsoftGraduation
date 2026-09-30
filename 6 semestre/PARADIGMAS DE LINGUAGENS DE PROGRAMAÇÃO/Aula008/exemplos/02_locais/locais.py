# Aula 08 - Ambiente de referenciamento local e subprogramas aninhados (Sebesta 9.4, p. 373-375)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python locais.py
def externo():
    x = "local de externo"

    def interno():               # subprograma aninhado (p. 375)
        print("interno enxerga:", x)

    interno()


externo()
# interno()                      # NameError: interno só existe dentro de externo


def recursiva(n):
    local = n * 10               # cada ATIVAÇÃO tem a sua própria cópia de 'local'
    if n > 0:
        recursiva(n - 1)
    print(f"n={n} local={local}")


recursiva(2)                     # n=0 local=0 / n=1 local=10 / n=2 local=20

# Aula 11 - Exceções em Python: try/except/else/finally (Sebesta 14.4.1, p. 613-615)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python excecoes.py
class SaldoInsuficiente(Exception):               # exceção definida pelo usuário
    def __init__(self, falta):
        super().__init__(f"faltam {falta}")
        self.falta = falta


saldo = 100


def sacar(valor):
    global saldo
    if valor > saldo:
        raise SaldoInsuficiente(valor - saldo)    # raise = levantar
    saldo -= valor


for valor in (30, 250):
    try:
        sacar(valor)
    except SaldoInsuficiente as e:
        print("erro:", e)
    else:                                         # só se NÃO houve exceção (p. 614)
        print("saque de", valor, "ok")
    finally:                                      # sempre
        print("saldo:", saldo)

# EAFP: "é mais fácil pedir perdão do que permissão"
config = {"porta": "8080"}
try:
    host = config["host"]
except KeyError:
    host = "localhost"
print("host:", host)

# Encadeamento: a nova exceção guarda a causa original
try:
    try:
        int("abc")
    except ValueError as e:
        raise RuntimeError("configuração inválida") from e
except RuntimeError as e:
    print(e, "| causa:", repr(e.__cause__))

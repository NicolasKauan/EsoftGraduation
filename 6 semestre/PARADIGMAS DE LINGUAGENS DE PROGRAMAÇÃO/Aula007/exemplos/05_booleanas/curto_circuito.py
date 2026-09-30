# Aula 07 - Curto-circuito em Python (Sebesta 7.6, p. 315-317)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python curto_circuito.py
def caro():
    print("  caro() foi chamada")
    return True

print(False and caro())     # False: caro() não é chamada
print(True or caro())       # True: idem

# and / or devolvem um dos OPERANDOS, não necessariamente True/False
print(0 or "padrão")        # padrão  (cuidado: 0 conta como falso!)
print("" or "anônimo")      # anônimo
print([] and "nunca")       # []

nome = None
print(nome is not None and len(nome) > 0)   # False, sem erro

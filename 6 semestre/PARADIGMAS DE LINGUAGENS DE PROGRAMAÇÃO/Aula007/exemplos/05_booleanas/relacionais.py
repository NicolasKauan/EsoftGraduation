# Aula 07 - Expressões relacionais e booleanas em Python (Sebesta 7.5, p. 313-315)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python relacionais.py
a, b, c = 3, 2, 1
print(a > b > c)        # True: Python encadeia -> (a > b) and (b > c)

# Valores que contam como FALSO ("falsy") em um if
for v in [0, 0.0, "", [], {}, None, "0", [0], " "]:
    print(f"{v!r:6} -> {bool(v)}")

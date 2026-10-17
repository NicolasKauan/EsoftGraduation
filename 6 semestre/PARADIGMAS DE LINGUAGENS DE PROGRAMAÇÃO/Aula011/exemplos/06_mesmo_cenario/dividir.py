# Aula 11 - Mesmo cenário: converter um texto e dividir 100 por ele (Python: exceções)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python dividir.py
def dividir_cem(texto):
    return 100 // int(texto)


for entrada in ["4", "0", "abc"]:
    try:
        print(entrada, "->", dividir_cem(entrada))
    except ValueError as e:
        print(entrada, "-> não é um número:", e)
    except ZeroDivisionError as e:
        print(entrada, "->", e)

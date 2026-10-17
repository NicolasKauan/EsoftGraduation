# Aula 11 - Finalização com "with" (gerenciadores de contexto) (Sebesta 14.4.1, p. 613-615)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python contexto.py
from contextlib import contextmanager


@contextmanager
def recurso(nome):
    print("abre", nome)
    try:
        yield nome
    finally:
        print("fecha", nome)          # finalização garantida


try:
    with recurso("a.txt") as a, recurso("b.txt") as b:
        print("usando", a, b)
        raise OSError("falha no meio")
except OSError as e:
    print("erro:", e)                 # os dois já foram fechados, na ordem inversa

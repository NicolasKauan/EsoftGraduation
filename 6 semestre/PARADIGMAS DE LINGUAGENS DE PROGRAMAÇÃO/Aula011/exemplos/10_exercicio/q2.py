# Exercício Aula 11 - Questão 2: o que é impresso, e em que ordem?
# Online: https://onecompiler.com/python  (cole o código inteiro)
def f(x):
    try:
        r = 10 / x
    except ZeroDivisionError:
        print("A")
        return -1
    else:
        print("B")
        return r
    finally:
        print("C")


print(f(0))
print(f(5))

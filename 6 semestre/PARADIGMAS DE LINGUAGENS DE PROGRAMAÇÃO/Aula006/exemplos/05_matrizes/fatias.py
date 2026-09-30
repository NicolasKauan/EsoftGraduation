# Aula 06 - Fatias e matrizes irregulares (Sebesta 6.5.6-6.5.7, p. 254)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python fatias.py
a = [1, 2, 3, 4, 5]
s = a[1:3]          # em listas Python, a fatia é uma CÓPIA
s[0] = 99
print("a =", a, " s =", s)

print(a[::-1])      # passo negativo: lista invertida
print(a[::2])       # de 2 em 2

m = [[1, 2, 3], [4, 5], [6]]          # matriz irregular: lista de listas
print([len(linha) for linha in m])    # [3, 2, 1]

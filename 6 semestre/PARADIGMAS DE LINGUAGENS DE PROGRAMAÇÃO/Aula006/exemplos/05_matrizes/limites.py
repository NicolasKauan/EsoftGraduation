# Aula 06 - Matrizes e verificação de índices (Sebesta 6.5.2-6.5.3, p. 249-251)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python limites.py
v = [10, 20, 30]
print(v[-1])        # 30: índice negativo conta a partir do fim (como em Perl, p. 249)
v.append(40)        # lista Python = matriz dinâmica do monte
print(v)

try:
    print(v[10])
except IndexError as e:
    print("IndexError:", e)

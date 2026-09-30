# Aula 06 - Cadeias de caracteres (Sebesta 6.3, p. 240-244)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python cadeias.py
s = "ação"
print(len(s))                    # 4 (code points)
print(len("👍"))                 # 1
print(len(s.encode("utf-8")))    # 6 bytes
print(s[1], s[-1])               # ç o
print(s[1:3])                    # çã (fatia)

try:
    s[0] = "A"
except TypeError as e:
    print("TypeError:", e)       # str é imutável

print(s.upper())                 # AÇÃO (nova string)

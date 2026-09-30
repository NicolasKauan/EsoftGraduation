# Autopesquisa - Matrizes associativas (Sebesta 6.6, p. 259-263)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python associativas.py
idades = {"ana": 20, "bia": 22}
idades["caio"] = 19
print(idades.get("zeca", "não existe"))
for nome, idade in idades.items():   # desde o Python 3.7, mantém a ordem de inserção
    print(nome, idade)
del idades["bia"]
print("bia" in idades, idades)

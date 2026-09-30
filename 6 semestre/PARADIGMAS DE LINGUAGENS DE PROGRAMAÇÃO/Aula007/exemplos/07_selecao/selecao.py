# Aula 07 - match estrutural (Python 3.10+) e expressão condicional (Sebesta 7.2.1.6 e 8.2.2)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python selecao.py
def descrever(comando):
    match comando.split():
        case ["sair"]:
            return "encerrando"
        case ["ir", direcao] if direcao in ("norte", "sul"):   # guarda
            return f"indo para o {direcao}"
        case ["pegar", *itens]:
            return f"pegando {len(itens)} item(ns)"
        case _:
            return "comando desconhecido"


for c in ["sair", "ir norte", "ir leste", "pegar chave mapa"]:
    print(f"{c!r:20} -> {descrever(c)}")

x = -3
y = x if x > 0 else 2 * x    # expressão condicional (p. 306)
print("y =", y)              # -6

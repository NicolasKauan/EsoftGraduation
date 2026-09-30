# Aula 08 - Parâmetros posicionais, de palavra-chave, padrão e variádicos (Sebesta 9.2.3, p. 367-371)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python parametros.py

def calcular_salario(renda, aliquota, dependentes=1):   # cabeçalho: nome + parâmetros FORMAIS
    """Inspirado no compute_pay do livro (p. 368-369)."""
    return renda * (1 - aliquota) + 100 * dependentes


print(calcular_salario(2000.0, 0.15))                          # 1800.0: dependentes usa o padrão
print(calcular_salario(2000.0, 0.15, 3))                       # 2000.0: parâmetros REAIS por posição
print(calcular_salario(aliquota=0.15, renda=2000.0))           # 1800.0: palavra-chave, qualquer ordem
print(calcular_salario(2000.0, aliquota=0.10, dependentes=2))  # 2000.0: posicionais antes


def media(*valores):           # número variável de parâmetros (p. 369-370)
    return sum(valores) / len(valores)


print(media(7, 8, 9))          # 8.0


def cadastrar(nome, **extras): # parâmetros de palavra-chave arbitrários
    print(nome, extras)


cadastrar("Ana", curso="ESOFT", periodo=6)   # Ana {'curso': 'ESOFT', 'periodo': 6}

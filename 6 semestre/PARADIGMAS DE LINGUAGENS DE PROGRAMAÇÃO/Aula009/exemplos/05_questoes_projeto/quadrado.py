# Aula 09 - Subclasses são subtipos? O princípio da substituição (Sebesta 12.3.2, p. 494-495)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python quadrado.py
class Retangulo:
    def __init__(self, largura, altura):
        self.largura, self.altura = largura, altura

    def definir_largura(self, l):
        self.largura = l

    def area(self):
        return self.largura * self.altura


class Quadrado(Retangulo):                 # "um quadrado É UM retângulo"... será?
    def __init__(self, lado):
        super().__init__(lado, lado)

    def definir_largura(self, l):          # para continuar quadrado, muda os dois lados
        self.largura = self.altura = l


def dobrar_largura(r):
    area_antes = r.area()
    r.definir_largura(r.largura * 2)
    return r.area() == 2 * area_antes      # vale para qualquer retângulo...


print(dobrar_largura(Retangulo(2, 3)))     # True
print(dobrar_largura(Quadrado(2)))         # False: Quadrado não se comporta como um Retangulo

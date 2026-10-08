# Aula 09 - Métodos de acesso como propriedades em Python (Sebesta 11.2.2, p. 449-450)
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python propriedades.py
class Temperatura:
    def __init__(self, celsius):
        self.celsius = celsius            # já passa pela validação do "setter"

    @property
    def celsius(self):                    # leitor (getter)
        return self._celsius

    @celsius.setter
    def celsius(self, valor):             # escritor (setter) com validação
        if valor < -273.15:
            raise ValueError("abaixo do zero absoluto")
        self._celsius = valor

    @property
    def fahrenheit(self):                 # propriedade calculada, só de leitura
        return self._celsius * 9 / 5 + 32


t = Temperatura(25)
print(t.celsius, t.fahrenheit)            # 25 77.0: parece um campo, mas é um método
t.celsius = 100
print(t.fahrenheit)                       # 212.0
try:
    t.celsius = -300
except ValueError as e:
    print("erro:", e)                     # erro: abaixo do zero absoluto

// Aula 08 - Parâmetros de referência em C++, inclusive const & (Sebesta 9.5.4, p. 382-383)
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
// Local:  g++ troca.cpp -o troca && ./troca
#include <iostream>
#include <string>

void troca(int &a, int &b) {          // passagem por REFERÊNCIA
    int t = a; a = b; b = t;
}

int tamanho(const std::string &s) {   // const &: não copia e não deixa alterar
    // s += "!";                      // ERRO de compilação: s é constante
    return s.size();
}

int main() {
    int x = 1, y = 2;
    troca(x, y);                      // a chamada não mostra que x e y podem mudar!
    std::cout << "x=" << x << " y=" << y << "\n";   // x=2 y=1
    std::string texto(1000000, 'a');                // um milhão de caracteres
    std::cout << tamanho(texto) << "\n";            // 1000000, sem copiar o texto
    return 0;
}

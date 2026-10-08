// Aula 09 - TADs parametrizados em C++: templates (Sebesta 11.5.1, p. 470-472)
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
// Local:  g++ pilha_template.cpp -o pilha_template && ./pilha_template
#include <iostream>
#include <string>
#include <vector>

template <typename T>
class Pilha {
    std::vector<T> dados;
public:
    void empilhar(const T &x) { dados.push_back(x); }
    T desempilhar() { T x = dados.back(); dados.pop_back(); return x; }
    bool vazia() const { return dados.empty(); }
};

template <typename T>
T maior(T a, T b) { return a > b ? a : b; }     // função genérica (9.10.1, p. 398)

int main() {
    Pilha<int> ints;                  // o compilador GERA uma classe para int...
    Pilha<std::string> textos;        // ...e outra para string (instanciação)
    ints.empilhar(42);
    textos.empilhar("oi");
    std::cout << ints.desempilhar() << " " << textos.desempilhar() << "\n";    // 42 oi
    std::cout << maior(3, 7) << " " << maior(std::string("ana"), std::string("bia")) << "\n";   // 7 bia
    return 0;
}

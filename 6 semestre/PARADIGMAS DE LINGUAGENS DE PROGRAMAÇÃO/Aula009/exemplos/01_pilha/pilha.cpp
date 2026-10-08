// Aula 09 - O TAD pilha em C++: private, construtor e destrutor (Sebesta 11.4.1, p. 451-457)
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
// Local:  g++ pilha.cpp -o pilha && ./pilha
#include <iostream>

class Pilha {
private:                                   // ocultação de informação
    int *dados;
    int capacidade;
    int indiceTopo;
public:
    Pilha(int cap) : dados(new int[cap]), capacidade(cap), indiceTopo(-1) {}       // construtor
    ~Pilha() { delete[] dados; std::cout << "(destrutor liberou a memória)\n"; }   // destrutor
    void empilhar(int x) { if (indiceTopo < capacidade - 1) dados[++indiceTopo] = x; }
    void desempilhar()   { if (!vazia()) --indiceTopo; }
    int topo() const     { return dados[indiceTopo]; }
    bool vazia() const   { return indiceTopo == -1; }
};

int main() {
    Pilha p(10);                     // objeto na PILHA de execução
    p.empilhar(42);
    p.empilhar(29);
    std::cout << "29 is: " << p.topo() << "\n";
    p.desempilhar();
    std::cout << "42 is: " << p.topo() << "\n";
    // p.indiceTopo = 5;             // ERRO de compilação: membro privado
    return 0;
}                                    // fim do escopo: o destrutor é chamado sozinho

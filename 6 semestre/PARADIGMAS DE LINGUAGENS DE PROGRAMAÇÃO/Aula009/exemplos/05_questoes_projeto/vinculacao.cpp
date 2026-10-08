// Aula 09 - Vinculação estática x dinâmica e fatiamento de objetos (Sebesta 12.3.4-12.3.5, p. 496-497)
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
// Local:  g++ vinculacao.cpp -o vinculacao && ./vinculacao
#include <iostream>

class A {
public:
    void estatico()         { std::cout << "A::estatico\n"; }   // vinculação ESTÁTICA
    virtual void dinamico() { std::cout << "A::dinamico\n"; }   // vinculação DINÂMICA
    virtual ~A() {}
};

class B : public A {
public:
    void estatico()          { std::cout << "B::estatico\n"; }
    void dinamico() override { std::cout << "B::dinamico\n"; }
};

int main() {
    B b;
    A *p = &b;             // ponteiro para a classe base apontando para um B
    p->estatico();         // A::estatico: decidido pelo tipo do PONTEIRO, na compilação
    p->dinamico();         // B::dinamico: decidido pelo tipo do OBJETO, na execução

    A a = b;               // cópia por valor: "fatiamento de objetos" (p. 497)
    a.dinamico();          // A::dinamico: a parte B foi cortada
    return 0;
}

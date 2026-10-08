// Exercício Aula 09 - Questão 2: qual é a saída? Por quê?
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
#include <iostream>

struct A { void f() { std::cout << "A\n"; } };
struct B : A { void f() { std::cout << "B\n"; } };

int main() {
    B b;
    A *p = &b;
    p->f();
    return 0;
}

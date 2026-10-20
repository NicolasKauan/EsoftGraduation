// Exercício Aula 11 - Questão 4: o que é impresso?
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
#include <iostream>

int main() {
    try {
        throw 42;
    } catch (double d) {
        std::cout << "double " << d << "\n";
    } catch (...) {
        std::cout << "outro\n";
    }
    return 0;
}

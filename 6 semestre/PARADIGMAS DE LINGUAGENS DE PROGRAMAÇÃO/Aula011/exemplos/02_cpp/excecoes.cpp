// Aula 11 - Tratamento de exceções em C++ (Sebesta 14.2, p. 602-606)
// Online: https://onecompiler.com/cpp  (cole o código inteiro)
// Local:  g++ excecoes.cpp -o excecoes && ./excecoes
#include <iostream>
#include <stdexcept>
#include <string>

class SaldoInsuficiente : public std::runtime_error {     // exceção definida pelo usuário
public:
    double falta;
    SaldoInsuficiente(double f) : std::runtime_error("saldo insuficiente"), falta(f) {}
};

struct Recurso {                                         // RAII: o destrutor faz a finalização
    std::string nome;
    Recurso(std::string n) : nome(n) { std::cout << "  abre " << nome << "\n"; }
    ~Recurso() { std::cout << "  fecha " << nome << "\n"; }
};

void sacar(double saldo, double valor) {
    Recurso r("conexão");                                // é fechado mesmo se houver exceção
    if (valor > saldo) throw SaldoInsuficiente(valor - saldo);
    std::cout << "  saque de " << valor << " ok\n";
}

int main() {
    try {
        sacar(100, 30);
        sacar(100, 250);
    } catch (const SaldoInsuficiente &e) {               // captura por referência
        std::cout << e.what() << ": faltam " << e.falta << "\n";
    }

    try {
        throw 42;                                        // C++ lança QUALQUER tipo, até int (p. 603)
    } catch (int codigo) {
        std::cout << "capturei o int " << codigo << "\n";
    }

    try {
        throw std::string("texto");
    } catch (...) {                                      // captura qualquer coisa (p. 603)
        std::cout << "capturei algo desconhecido\n";
    }
    // int zero = 0; std::cout << 1 / zero;  // NÃO vira exceção: comportamento indefinido (p. 606)
    return 0;
}

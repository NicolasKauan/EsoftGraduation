// Aula 09 - Genéricos em Rust: restrições por traits (Sebesta 11.5, p. 470-474)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc genericos.rs && ./genericos
use std::fmt::Display;

struct Pilha<T> {
    dados: Vec<T>,
}

impl<T> Pilha<T> {
    fn nova() -> Self {
        Pilha { dados: Vec::new() }
    }
    fn empilhar(&mut self, x: T) {
        self.dados.push(x);
    }
    fn desempilhar(&mut self) -> Option<T> {
        self.dados.pop()
    }
}

fn maior<T: PartialOrd + Display>(a: T, b: T) -> String {
    if a > b { format!("{}", a) } else { format!("{}", b) }
}

fn main() {
    let mut p: Pilha<&str> = Pilha::nova();
    p.empilhar("Ana");
    p.empilhar("Bia");
    println!("{:?}", p.desempilhar()); // Some("Bia")
    println!("{}", maior(3, 7));       // 7
    println!("{}", maior(2.5, 1.5));   // 2.5
    // Como os templates de C++, Rust gera uma versão do código para cada tipo ("monomorfização")
}

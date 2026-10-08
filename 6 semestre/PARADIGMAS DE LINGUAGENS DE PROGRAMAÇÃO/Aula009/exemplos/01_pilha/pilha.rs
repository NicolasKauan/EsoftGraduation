// Aula 09 - O TAD pilha em Rust: privado por padrão, 'pub' exporta (Sebesta 11.2-11.4)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc pilha.rs && ./pilha
mod pilha {
    pub struct Pilha {
        dados: Vec<i32>, // campo privado ao módulo
    }

    impl Pilha {
        pub fn nova() -> Pilha {       // "construtor" é só uma função associada
            Pilha { dados: Vec::new() }
        }
        pub fn empilhar(&mut self, x: i32) {
            self.dados.push(x);
        }
        pub fn desempilhar(&mut self) -> Option<i32> {
            self.dados.pop()
        }
        pub fn topo(&self) -> Option<&i32> {
            self.dados.last()
        }
        pub fn vazia(&self) -> bool {
            self.dados.is_empty()
        }
    }
}

use pilha::Pilha;

fn main() {
    let mut p = Pilha::nova();
    p.empilhar(42);
    p.empilhar(29);
    println!("29 is: {:?}", p.topo()); // Some(29)
    p.desempilhar();
    println!("42 is: {:?}", p.topo()); // Some(42)
    p.desempilhar();
    println!("vazia? {} {:?}", p.vazia(), p.desempilhar()); // true None
    // p.dados.push(1);                // ERRO de compilação: o campo 'dados' é privado
}

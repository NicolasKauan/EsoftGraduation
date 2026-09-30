// Aula 07 - Operadores sobrecarregados definidos pelo usuário (Sebesta 7.3, p. 309; 9.11, p. 404)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc ponto.rs && ./ponto
use std::ops::Add;

#[derive(Debug, Clone, Copy, PartialEq)]
struct Ponto {
    x: i32,
    y: i32,
}

impl Add for Ponto {        // sobrecarga do + por meio de um trait
    type Output = Ponto;
    fn add(self, outro: Ponto) -> Ponto {
        Ponto { x: self.x + outro.x, y: self.y + outro.y }
    }
}

fn main() {
    let p = Ponto { x: 1, y: 2 } + Ponto { x: 3, y: 4 };
    println!("{:?}", p);                        // Ponto { x: 4, y: 6 }
    println!("{}", p == Ponto { x: 4, y: 6 });  // true (PartialEq gerado)
    // let q = p * 2;   // ERRO de compilação: o operador * não foi definido para Ponto
}

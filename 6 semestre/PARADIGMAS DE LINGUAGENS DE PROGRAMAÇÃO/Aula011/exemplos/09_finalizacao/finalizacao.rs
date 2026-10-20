// Aula 11 - Finalização em Rust: Drop (Sebesta 14.1.2, p. 600-601)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc finalizacao.rs && ./finalizacao
struct Recurso(&'static str);

impl Drop for Recurso {
    fn drop(&mut self) {
        println!("liberando {}", self.0); // chamado sozinho, como o destrutor de C++
    }
}

fn main() {
    let _a = Recurso("a");
    {
        let _b = Recurso("b");
        println!("fim do bloco interno");
    } // b é liberado aqui
    let _c = Recurso("c");
    println!("fim do main");
} // c e depois a: ordem inversa

// Exercício Aula 10 - Questão 5: o que acontece?
// Online: https://onecompiler.com/rust  (cole o código inteiro)
use std::thread;

fn main() {
    let mut contador = 0;
    let t = thread::spawn(|| {
        contador += 1;
    });
    t.join().unwrap();
    println!("{}", contador);
}

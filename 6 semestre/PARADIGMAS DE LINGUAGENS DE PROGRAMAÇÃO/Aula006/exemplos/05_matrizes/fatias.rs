// Aula 06 - Fatias (Sebesta 6.5.7, p. 254)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc fatias.rs && ./fatias
fn soma(fatia: &[i32]) -> i32 {
    fatia.iter().sum()
}

fn main() {
    let mut v = vec![1, 2, 3, 4, 5];
    let s = &v[1..3]; // empresta parte de v, sem copiar
    println!("s = {:?}, soma = {}", s, soma(s));

    // v.push(6);     // ERRO de compilação (E0502): v está emprestado para s
    println!("ainda usando s: {:?}", s);

    v.push(6); // ok: o empréstimo de s já terminou
    println!("v = {:?}", v);
}

// Aula 08 - Rust: &, &mut e transferência de posse (Sebesta 9.5.1, p. 376)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc passagem.rs && ./passagem
fn soma(v: &Vec<i32>) -> i32 {     // & : empréstimo só de leitura (modo de ENTRADA)
    v.iter().sum()
}

fn dobra(v: &mut Vec<i32>) {       // &mut : empréstimo com escrita (modo de ENTRADA E SAÍDA)
    for x in v.iter_mut() {
        *x *= 2;
    }
}

fn consome(v: Vec<i32>) -> usize { // sem & : a POSSE é transferida
    v.len()
}

fn main() {
    let mut v = vec![1, 2, 3];
    println!("soma = {}", soma(&v));      // soma = 6
    dobra(&mut v);                        // a CHAMADA deixa claro que v pode mudar
    println!("{:?}", v);                  // [2, 4, 6]
    println!("tamanho = {}", consome(v)); // tamanho = 3
    // println!("{:?}", v);               // ERRO de compilação: v foi movido para consome
}

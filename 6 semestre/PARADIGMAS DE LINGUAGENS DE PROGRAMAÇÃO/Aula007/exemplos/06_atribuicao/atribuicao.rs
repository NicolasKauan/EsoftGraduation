// Aula 07 - Atribuição em Rust: imutável por padrão (Sebesta 7.7.7, p. 321)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc atribuicao.rs && ./atribuicao
fn main() {
    let x = 5;               // imutável por padrão
    // x = 6;                // ERRO de compilação: não pode atribuir duas vezes
    let x = x + 1;           // "sombreamento": uma NOVA variável x (como o val de ML, p. 321)
    println!("x = {}", x);   // 6

    let mut total = 0;       // mut: mutável de forma explícita
    total += 10;
    println!("total = {}", total);

    let (a, b) = (1, 2);     // desestruturação
    println!("{} {}", a, b);

    // if total = 3 { }      // ERRO de compilação: a atribuição vale (), não bool
}

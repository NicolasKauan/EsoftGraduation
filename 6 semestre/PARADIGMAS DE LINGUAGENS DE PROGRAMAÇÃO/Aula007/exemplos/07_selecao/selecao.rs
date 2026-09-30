// Aula 07 - match exaustivo e if como expressão (Sebesta 8.2.1.5 e 8.2.2, p. 333-341)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc selecao.rs && ./selecao
fn classificar(n: i32) -> &'static str {
    match n {
        i32::MIN..=-1 => "negativo",
        0 => "zero",
        1..=9 => "um dígito",
        _ => "vários dígitos", // apague esta linha: ERRO de compilação (padrão não coberto)
    }
}

fn main() {
    for n in [-5, 0, 7, 42] {
        println!("{} -> {}", n, classificar(n));
    }
    let x = 10;
    let y = if x > 0 { x } else { 2 * x }; // if é uma EXPRESSÃO (como em F#, p. 334)
    println!("y = {}", y);
    // let z = if x > 0 { 1 };              // ERRO de compilação: falta o else
}

// Aula 11 - Mesmo cenário: converter um texto e dividir 100 por ele (Rust: Result)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc dividir.rs && ./dividir
#[derive(Debug)]
enum ErroDivisao {
    NaoNumero(std::num::ParseIntError),
    PorZero,
}

fn dividir_cem(texto: &str) -> Result<i32, ErroDivisao> {
    let n: i32 = texto.parse().map_err(ErroDivisao::NaoNumero)?; // ? repassa o erro
    100i32.checked_div(n).ok_or(ErroDivisao::PorZero)          // 100 / 0 daria panic
}

fn main() {
    for entrada in ["4", "0", "abc"] {
        match dividir_cem(entrada) {
            Ok(r) => println!("{} -> {}", entrada, r),
            Err(ErroDivisao::NaoNumero(e)) => println!("{} -> não é um número ({})", entrada, e),
            Err(ErroDivisao::PorZero) => println!("{} -> divisão por zero", entrada),
        }
    }
}

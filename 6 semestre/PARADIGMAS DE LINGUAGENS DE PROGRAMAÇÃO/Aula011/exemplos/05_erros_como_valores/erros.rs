// Aula 11 - Rust: Result, o operador ? e panic
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc erros.rs && ./erros
use std::fs;
use std::num::ParseIntError;

fn dobro(texto: &str) -> Result<i32, ParseIntError> {
    let n: i32 = texto.trim().parse()?; // ?: se for Err, devolve o erro para quem chamou
    Ok(n * 2)
}

fn main() {
    println!("{:?}", dobro("21")); // Ok(42)
    println!("{:?}", dobro("x"));  // Err(ParseIntError { kind: InvalidDigit })

    match fs::read_to_string("nao_existe.txt") {
        Ok(conteudo) => println!("{}", conteudo),
        Err(e) => println!("erro: {}", e), // o tipo Result OBRIGA a considerar o erro
    }

    let v = vec![1, 2, 3];
    println!("{:?}", v.get(10)); // None: ausência sem exceção
    // let n: i32 = "x".parse().unwrap();  // panic: unwrap em um Err encerra o programa
}

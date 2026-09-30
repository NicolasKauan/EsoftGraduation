// Aula 08 - Fechamentos em Rust: captura por referência ou por posse (Sebesta 9.12, p. 404-406)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc fechamentos.rs && ./fechamentos
fn criar_somador(x: i32) -> impl Fn(i32) -> i32 {
    move |y| x + y // 'move': o fechamento passa a ser DONO de x
}

fn main() {
    let add10 = criar_somador(10);
    println!("{}", add10(20)); // 30

    let mut contador = 0;
    let mut incrementa = || contador += 1; // captura contador por referência mutável
    incrementa();
    incrementa();
    println!("contador = {}", contador); // contador = 2

    let nomes = vec!["ana", "bia"];
    let maiusculos: Vec<String> = nomes.iter().map(|n| n.to_uppercase()).collect();
    println!("{:?}", maiusculos); // ["ANA", "BIA"]
}

// Aula 06 - Cadeias de caracteres (Sebesta 6.3, p. 240-244)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc cadeias.rs && ./cadeias
fn main() {
    let s = String::from("ação");
    println!("len (bytes)     = {}", s.len());           // 6
    println!("chars().count() = {}", s.chars().count()); // 4

    // let c = s[0];  // ERRO de compilação: String não é indexável por inteiro
    println!("primeiro char   = {:?}", s.chars().next()); // Some('a')
    println!("fatia [0..1]    = {}", &s[0..1]);           // a
    println!("fatia [1..3]    = {}", &s[1..3]);           // ç (2 bytes)

    // &str: fatia emprestada e imutável | String: dona do texto, pode crescer
    let literal: &str = "olá";
    let mut dono: String = literal.to_string();
    dono.push_str(", mundo");
    println!("{} -> {}", literal, dono);

    // Descomente para ver o panic: corta o 'ç' (2 bytes) ao meio
    // println!("{}", &s[0..2]);
}

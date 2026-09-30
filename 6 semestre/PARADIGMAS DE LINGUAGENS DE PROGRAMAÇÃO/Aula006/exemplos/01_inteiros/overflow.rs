// Aula 06 - Tipos de dados primitivos: inteiros (Sebesta 6.2.1.1, p. 236)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc overflow.rs && ./overflow
//   (sem -O o binário é "debug": verificação de estouro LIGADA)
//   No Rust Playground (https://play.rust-lang.org), mantenha o modo "Debug".
fn main() {
    // Lemos o valor de uma string para que o compilador não "enxergue"
    // a conta em tempo de compilação (ele recusaria o programa).
    let x: i32 = "2147483647".parse().unwrap();

    // O programador escolhe EXPLICITAMENTE o comportamento:
    println!("checked_add     = {:?}", x.checked_add(1));     // None
    println!("wrapping_add    = {}", x.wrapping_add(1));       // -2147483648
    println!("saturating_add  = {}", x.saturating_add(1));     // 2147483647
    println!("overflowing_add = {:?}", x.overflowing_add(1));  // (-2147483648, true)

    let y = x + 1; // debug: panic "attempt to add with overflow"
    println!("x + 1 = {}", y); // em modo debug nunca chega aqui
}

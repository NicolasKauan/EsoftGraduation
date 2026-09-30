// Aula 07 - Conversões de tipos: 'as' e conversões verificadas (Sebesta 7.4, p. 310-313)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc conversoes.rs && ./conversoes
use std::convert::TryFrom;

fn main() {
    let i: i32 = 300;
    // let b: u8 = i;                  // ERRO de compilação: não há coerção implícita
    println!("{}", i as u8);           // 44: 'as' trunca (300 - 256)
    println!("{}", -1i32 as u32);      // 4294967295
    println!("{}", 3.99_f64 as i32);   // 3
    println!("{}", 1e20_f64 as i32);   // 2147483647: de real para inteiro, 'as' satura
    println!("{:?}", u8::try_from(i));      // Err(TryFromIntError(PosOverflow)): conversão VERIFICADA falhou
    println!("{:?}", u8::try_from(200i32)); // Ok(200)
}

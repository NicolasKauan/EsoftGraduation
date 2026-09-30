// Aula 08 - Rust proíbe apelidos com escrita (Sebesta 9.5.2.4, p. 379-380)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc apelidos.rs && ./apelidos
fn soma_duas_vezes(a: &mut i32, b: &i32) {
    *a += *b;
    *a += *b;
}

fn main() {
    let mut x = 1;
    let y = 1;
    soma_duas_vezes(&mut x, &y);
    println!("x = {}", x);                   // 3

    let mut total = 1;
    // soma_duas_vezes(&mut total, &total);  // ERRO de compilação (E0502): não pode haver um
    //                                        // empréstimo &mut e um & do mesmo valor ao mesmo tempo
    let copia = total;
    soma_duas_vezes(&mut total, &copia);
    println!("total = {}", total);           // 3
}

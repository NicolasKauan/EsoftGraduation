// Aula 07 - break rotulado e loop como expressão em Rust (Sebesta 8.3.3, p. 347-349)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc rotulos.rs && ./rotulos
fn main() {
    let m = [[1, 2, 3], [4, -5, 6], [7, 8, 9]];
    'externo: for (i, linha) in m.iter().enumerate() {
        for (j, &v) in linha.iter().enumerate() {
            if v < 0 {
                println!("negativo em ({}, {})", i, j);
                break 'externo; // sai dos dois laços
            }
        }
    }

    // loop é uma EXPRESSÃO: o break pode devolver um valor
    let mut n = 1;
    let potencia = loop {
        n *= 2;
        if n > 100 {
            break n;
        }
    };
    println!("primeira potência de 2 acima de 100: {}", potencia); // 128
}

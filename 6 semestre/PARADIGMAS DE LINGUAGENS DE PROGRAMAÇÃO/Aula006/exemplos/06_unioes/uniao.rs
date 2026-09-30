// Aula 06 - Uniões discriminadas (Sebesta 6.10.2-6.10.3, p. 271-272)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc uniao.rs && ./uniao
// Em Rust, um enum pode carregar dados: é uma união discriminada verificada pelo compilador.
enum Valor {
    Inteiro(i64),
    Real(f64),
    Texto(String),
}

fn descrever(v: &Valor) -> String {
    match v {
        Valor::Inteiro(i) => format!("inteiro {}", i),
        Valor::Real(r) => format!("real {:.2}", r),
        Valor::Texto(s) => format!("texto \"{}\"", s),
        // Apague um dos braços acima: o compilador recusa (E0004 - padrão não coberto)
    }
}

// Option<T> também é uma união discriminada: Some(valor) | None
fn dividir(a: f64, b: f64) -> Option<f64> {
    if b == 0.0 { None } else { Some(a / b) }
}

fn main() {
    let valores = vec![
        Valor::Inteiro(27),
        Valor::Real(3.1416),
        Valor::Texto("oi".to_string()),
    ];
    for v in &valores {
        println!("{}", descrever(v));
    }
    println!("{:?} {:?}", dividir(1.0, 4.0), dividir(1.0, 0.0));
}

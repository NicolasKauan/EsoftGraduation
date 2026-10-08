// Aula 09 - OO sem herança de classes em Rust: traits (Sebesta 12.2-12.3)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc traits.rs && ./traits
trait Forma {
    fn area(&self) -> f64;
    fn descrever(&self) -> String {       // método com implementação padrão
        format!("área {:.2}", self.area())
    }
}

struct Circulo {
    r: f64,
}
struct Retangulo {
    l: f64,
    a: f64,
}

impl Forma for Circulo {
    fn area(&self) -> f64 {
        std::f64::consts::PI * self.r * self.r
    }
}

impl Forma for Retangulo {
    fn area(&self) -> f64 {
        self.l * self.a
    }
    fn descrever(&self) -> String {       // sobrescreve o padrão
        format!("retângulo {}x{}", self.l, self.a)
    }
}

fn main() {
    let formas: Vec<Box<dyn Forma>> = vec![
        Box::new(Circulo { r: 1.0 }),
        Box::new(Retangulo { l: 2.0, a: 3.0 }),
    ];
    for f in &formas {
        println!("{}", f.descrever());    // dyn Forma: vinculação dinâmica (por vtable)
    }
    // Rust não tem herança de structs: o reúso vem de traits e composição
}

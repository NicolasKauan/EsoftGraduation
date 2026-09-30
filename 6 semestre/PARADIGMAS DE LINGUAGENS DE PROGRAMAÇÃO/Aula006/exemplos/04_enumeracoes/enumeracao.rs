// Aula 06 - Tipos enumeração (Sebesta 6.4, p. 245-247)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc enumeracao.rs && ./enumeracao
#[derive(Debug, Clone, Copy)]
enum Semaforo {
    Verde,
    Amarelo,
    Vermelho,
}

fn proximo(s: Semaforo) -> Semaforo {
    match s {
        // match é exaustivo: esquecer um caso = erro de compilação
        Semaforo::Verde => Semaforo::Amarelo,
        Semaforo::Amarelo => Semaforo::Vermelho,
        Semaforo::Vermelho => Semaforo::Verde,
    }
}

fn main() {
    let mut s = Semaforo::Verde;
    for _ in 0..4 {
        println!("{:?}", s);
        s = proximo(s);
    }
    // enum -> inteiro só com conversão EXPLÍCITA
    println!("Vermelho como i32 = {}", Semaforo::Vermelho as i32);
    // let t: Semaforo = 2;  // ERRO de compilação: inteiro não vira enum
}

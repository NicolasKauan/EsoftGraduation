// Aula 06 - Referências seguras em Rust: posse (ownership) e empréstimo (borrowing)
// Complementa Sebesta 6.11.7.2 (p. 280): em vez de lápides ou fechaduras em tempo
// de execução, o compilador prova que não há ponteiros soltos.
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc posse.rs && ./posse
fn tamanho(s: &String) -> usize {
    // empresta: não toma posse
    s.len()
}

fn consumir(s: String) {
    // toma posse: s é liberada ao fim desta função
    println!("consumi \"{}\"", s);
}

fn main() {
    let s1 = String::from("olá");
    let s2 = s1; // a posse é MOVIDA de s1 para s2
    // println!("{}", s1);      // ERRO E0382: s1 foi movida

    println!("tamanho = {}", tamanho(&s2)); // empréstimo: s2 continua válida
    consumir(s2);
    // println!("{}", s2);      // ERRO E0382: s2 foi movida para consumir

    // Ponteiro solto? O compilador não deixa:
    // let r;
    // {
    //     let x = 5;
    //     r = &x;              // ERRO E0597: `x` não vive o suficiente
    // }
    // println!("{}", r);

    let nomes = vec!["Ana", "Bia"];
    match nomes.get(5) {
        // não existe null: a ausência é Option<&T>
        Some(n) => println!("achei {}", n),
        None => println!("índice 5 não existe"),
    }
}

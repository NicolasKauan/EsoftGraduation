// Aula 12 - Programação funcional em Rust: fechamentos e iteradores
// Online: https://onecompiler.com/rust  (cole o código inteiro)

fn compor<A, B, C>(f: impl Fn(A) -> B, g: impl Fn(B) -> C) -> impl Fn(A) -> C {
    move |x| g(f(x))                        // primeiro f, depois g
}

fn somador(n: i32) -> impl Fn(i32) -> i32 {
    move |x| x + n                          // fechamento: captura n
}

fn main() {
    let cubo = |x: i32| x * x * x;
    println!("{}", cubo(2));                                     // 8

    let h = compor(|x: i32| 3 * x, |x: i32| x + 2);              // h(x) = 3x + 2
    println!("{}", h(4));                                        // 14

    let mais10 = somador(10);
    println!("{}", mais10(5));                                   // 15

    let v = vec![1, 2, 3, 4, 5, 6];
    let soma: i32 = v.iter().filter(|&&n| n % 2 == 0).map(|&n| n * n).sum();
    println!("{}", soma);                                        // 4 + 16 + 36 = 56

    // Iteradores são preguiçosos: nada acontece até alguém consumir (sum, collect...)
    let preguicoso = v.iter().map(|n| {
        println!("  processando {}", n);
        n * 10
    });
    println!("nada foi processado ainda");
    let primeiros: Vec<i32> = preguicoso.take(2).collect();
    println!("{:?}", primeiros);                                 // [10, 20]

    // Faixa infinita: (1..) não tem fim, mas take_while pega só o necessário
    let quadrados: Vec<u64> = (1u64..).map(|n| n * n).take_while(|&q| q < 50).collect();
    println!("{:?}", quadrados);                                 // [1, 4, 9, 16, 25, 36, 49]

    // fold é a redução geral
    let fatorial = (1..=20u64).fold(1, |acc, n| acc * n);
    println!("{}", fatorial);                                    // 2432902008176640000

    // Imutável por padrão: sem "mut", nada muda; map cria valores novos
    let nomes = vec!["ana", "bruno"];
    let maiusculos: Vec<String> = nomes.iter().map(|s| s.to_uppercase()).collect();
    println!("{:?} {:?}", nomes, maiusculos);                    // ["ana", "bruno"] ["ANA", "BRUNO"]
}

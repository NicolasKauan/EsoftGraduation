// Aula 10 - Rust: canais e memória compartilhada verificados pelo compilador (Sebesta 13.5)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc mensagens.rs && ./mensagens
use std::sync::mpsc;
use std::sync::{Arc, Mutex};
use std::thread;

fn main() {
    // 1) Passagem de mensagens: canal com vários produtores e um consumidor
    let (tx, rx) = mpsc::channel();
    for id in 0..3 {
        let tx = tx.clone();
        thread::spawn(move || {
            tx.send(format!("olá da thread {}", id)).unwrap();
        });
    }
    drop(tx);
    let mut msgs: Vec<String> = rx.iter().collect();
    msgs.sort();
    println!("{:?}", msgs);

    // 2) Memória compartilhada: Arc (contagem de referências atômica) + Mutex
    let contador = Arc::new(Mutex::new(0));
    let mut alcas = vec![];
    for _ in 0..4 {
        let c = Arc::clone(&contador);
        alcas.push(thread::spawn(move || {
            for _ in 0..100_000 {
                *c.lock().unwrap() += 1;
            }
        }));
    }
    for a in alcas {
        a.join().unwrap();
    }
    println!("contador = {}", *contador.lock().unwrap()); // sempre 400000

    // let mut x = 0;
    // thread::spawn(|| x += 1);  // ERRO de compilação: a thread pode viver mais que x
    // Trocar Arc por Rc: ERRO de compilação, Rc não é Send (não pode cruzar threads)
}

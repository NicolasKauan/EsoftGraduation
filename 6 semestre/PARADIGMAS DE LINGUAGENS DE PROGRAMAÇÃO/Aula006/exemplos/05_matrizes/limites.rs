// Aula 06 - Matrizes e verificação de índices (Sebesta 6.5.2-6.5.3, p. 249-251)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc limites.rs && ./limites
fn main() {
    let arr = [10, 20, 30];       // [i32; 3]: tamanho no tipo, alocada na pilha
    let mut v = vec![10, 20, 30]; // Vec<i32>: no monte, pode crescer
    v.push(40);
    println!("{:?} {:?}", arr, v);

    // Acesso que não pode falhar: get devolve Option
    println!("v.get(10) = {:?}", v.get(10)); // None

    let i = v.len();                  // índice calculado em tempo de execução
    println!("v[{}] = {}", i, v[i]);  // panic: index out of bounds
}

// Aula 12 - Exercício 4: reescreva o laço com iteradores
// Online: https://onecompiler.com/rust  (cole o código inteiro)
fn main() {
    let leituras = [12, 7, 30, -1, 18, 25];   // -1 marca o fim das leituras
    let mut total = 0;
    for &x in leituras.iter() {
        if x < 0 {
            break;
        }
        total += x;
    }
    println!("{}", total);
}

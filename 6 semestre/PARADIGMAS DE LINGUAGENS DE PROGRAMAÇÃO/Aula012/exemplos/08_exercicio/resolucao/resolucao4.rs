// Aula 12 - Exercício 4: resolução
// Online: https://onecompiler.com/rust  (cole o código inteiro)
fn main() {
    let leituras = [12, 7, 30, -1, 18, 25];   // -1 marca o fim das leituras

    let mut total = 0;                         // imperativo
    for &x in leituras.iter() {
        if x < 0 {
            break;
        }
        total += x;
    }

    let total2: i32 = leituras.iter()          // funcional
        .take_while(|&&x| x >= 0)
        .sum();

    println!("{} {}", total, total2);          // 49 49
}

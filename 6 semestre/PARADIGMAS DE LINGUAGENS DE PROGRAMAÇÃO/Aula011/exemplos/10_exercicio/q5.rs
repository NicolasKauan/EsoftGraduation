// Exercício Aula 11 - Questão 5: o que acontece?
// Online: https://onecompiler.com/rust  (cole o código inteiro)
fn main() {
    let texto = "12a";
    let n: i32 = texto.parse().unwrap();
    println!("{}", n * 2);
}

// Exercício Aula 08 - Questão 5: qual é a saída? Por quê?
// Online: https://onecompiler.com/rust  (cole o código inteiro)
fn dobra(v: Vec<i32>) -> Vec<i32> {
    v.iter().map(|x| x * 2).collect()
}

fn main() {
    let v = vec![1, 2, 3];
    let d = dobra(v);
    println!("{:?} {:?}", v, d);
}

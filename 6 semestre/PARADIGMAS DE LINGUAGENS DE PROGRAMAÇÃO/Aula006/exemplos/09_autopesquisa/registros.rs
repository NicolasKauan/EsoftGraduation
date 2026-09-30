// Autopesquisa - Registros e tuplas (Sebesta 6.7-6.8, p. 263-268)
// Online: https://onecompiler.com/rust  (cole o código inteiro)
// Local:  rustc registros.rs && ./registros
#[derive(Debug, Clone, PartialEq)]
struct Aluno {
    nome: String,
    ra: u32,
    media: f64,
}

fn main() {
    let a = Aluno { nome: "Ana".to_string(), ra: 123, media: 7.5 };
    let b = Aluno { media: 9.0, ..a.clone() }; // copia os demais campos de a
    println!("{:?}", a);
    println!("{:?}", b);
    println!("iguais? {}", a == b);

    let par: (i32, &str) = (1, "um"); // tupla: campos acessados por posição
    let (n, nome) = par;              // desestruturação
    println!("{} {} {}", par.0, n, nome);
}

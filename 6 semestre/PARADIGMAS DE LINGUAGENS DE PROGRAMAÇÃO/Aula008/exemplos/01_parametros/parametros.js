// Aula 08 - Parâmetros em JavaScript: padrão, "rest" e desestruturação (Sebesta 9.2.3, p. 367-371)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node parametros.js
function saudacao(nome, saudar = "Olá", ...resto) {   // valor padrão e parâmetro "rest"
  return `${saudar}, ${nome}! (extras: ${resto.length})`;
}
console.log(saudacao("Ana"));                   // Olá, Ana! (extras: 0)
console.log(saudacao("Bia", "Oi", 1, 2, 3));    // Oi, Bia! (extras: 3)
console.log(saudacao());                        // Olá, undefined! (JS não confere a quantidade)

// "Parâmetros de palavra-chave" em JS: desestruturação de um objeto
function criarUsuario({ nome, idade = 18, ativo = true }) {
  return `${nome}, ${idade}, ${ativo}`;
}
console.log(criarUsuario({ idade: 30, nome: "Caio" }));   // Caio, 30, true

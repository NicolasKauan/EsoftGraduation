// Aula 07 - Curto-circuito e operadores modernos ?. e ?? (Sebesta 7.6, p. 315-317)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node curto_circuito.js
const usuario = { nome: "Ana", endereco: null };

// ?. (encadeamento opcional) para no primeiro null/undefined
console.log(usuario.endereco?.cidade);     // undefined, sem erro
// console.log(usuario.endereco.cidade);   // TypeError: Cannot read properties of null

// || devolve o primeiro valor "verdadeiro"... e 0 conta como falso!
const quantidade = 0;
console.log(quantidade || 10);             // 10  (bug: o 0 se perdeu)
console.log(quantidade ?? 10);             // 0   (?? só substitui null e undefined)

// Curto-circuito usado como um "if"
const log = [];
usuario.nome && log.push("tem nome");
console.log(log);                          // [ 'tem nome' ]

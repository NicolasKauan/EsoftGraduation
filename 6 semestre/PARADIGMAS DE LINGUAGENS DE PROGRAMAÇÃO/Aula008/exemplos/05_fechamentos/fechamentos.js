// Aula 08 - Fechamentos em JavaScript (Sebesta 9.12, p. 404-406)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node fechamentos.js
function makeAdder(x) {                 // exemplo do livro (p. 405)
  return function (y) { return x + y; };
}
const add10 = makeAdder(10);
const add5 = makeAdder(5);
console.log("Add 10 to 20: " + add10(20));   // 30
console.log("Add 5 to 20: " + add5(20));     // 25

// Estado privado: n sobrevive ao fim de criarContador (extensão ilimitada, p. 405)
function criarContador() {
  let n = 0;
  return { inc: () => ++n, valor: () => n };
}
const c = criarContador();
c.inc();
c.inc();
console.log(c.valor());        // 2
console.log(typeof n);         // undefined: n não é acessível de fora

// Armadilha clássica: var cria UMA variável para o laço inteiro
const comVar = [];
for (var i = 0; i < 3; i++) comVar.push(() => i);
console.log(comVar.map(f => f()));   // [ 3, 3, 3 ]
const comLet = [];
for (let j = 0; j < 3; j++) comLet.push(() => j);   // let: um j novo a cada volta
console.log(comLet.map(f => f()));   // [ 0, 1, 2 ]

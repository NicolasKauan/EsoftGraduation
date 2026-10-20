// Aula 12 - Programação funcional em JavaScript (Sebesta 15.10, p. 675)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node pipeline.js

// Função anônima (p. 675) e a forma com seta (ES2015)
const cubo1 = function (x) { return x * x * x; };
const cubo2 = (x) => x * x * x;
console.log(cubo1(2), cubo2(2));                   // 8 8

const compor = (f, g) => (x) => f(g(x));           // composição (p. 635)
const h = compor((x) => x + 2, (x) => 3 * x);
console.log(h(4));                                 // 14

console.log([2, 3, 4].map((x) => x * x));          // aplicar-a-todos: [ 4, 9, 16 ]

// Fechamento: a função "lembra" o n de quando foi criada
const somador = (n) => (x) => x + n;
const mais10 = somador(10);
console.log(mais10(5));                            // 15

// Currying à mão: uma função de 2 parâmetros vira uma cadeia de funções de 1
const vezes = (a) => (b) => a * b;
console.log([1, 2, 3].map(vezes(5)));              // [ 5, 10, 15 ]

// Pipeline: filtrar, transformar, reduzir
const soma = [1, 2, 3, 4, 5, 6]
  .filter((n) => n % 2 === 0)
  .map((n) => n * n)
  .reduce((acc, n) => acc + n, 0);
console.log(soma);                                 // 4 + 16 + 36 = 56

// Imutabilidade: criar um valor novo em vez de alterar o antigo
const original = Object.freeze({ nome: "Ana", nota: 7 });
const corrigido = { ...original, nota: 8 };
console.log(original, corrigido);                  // { nome: 'Ana', nota: 7 } { nome: 'Ana', nota: 8 }

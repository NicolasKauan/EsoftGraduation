// Aula 07 - Precedência e associatividade (Sebesta 7.2.1, p. 301-305)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node precedencia.js
const a = 3, b = 4, c = 5;
console.log("a + b * c =", a + b * c);        // 23
console.log("2 ** 3 ** 2 =", 2 ** 3 ** 2);    // 512: ** associa à direita

// console.log(-2 ** 2);   // ERRO de sintaxe: o JavaScript OBRIGA os parênteses
console.log("(-2) ** 2 =", (-2) ** 2);        // 4
console.log("-(2 ** 2) =", -(2 ** 2));        // -4

// + associa à esquerda, mas é sobrecarregado (número ou texto)
console.log(1 + 2 + "3");                     // 33
console.log("1" + 2 + 3);                     // 123

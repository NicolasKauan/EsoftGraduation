// Exercício Aula 07 - Questão 1: qual é a saída? Onde está o bug?
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
const precos = [10, 20, 30];
let total = 0;
for (const p in precos) total += p;
console.log("Total: " + total);

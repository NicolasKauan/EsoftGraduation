// Exercício Aula 10 - Questão 3: em que ordem as letras aparecem?
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
console.log("A");
setTimeout(() => console.log("B"), 0);
Promise.resolve().then(() => console.log("C"));
console.log("D");

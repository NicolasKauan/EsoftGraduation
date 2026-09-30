// Aula 06 - Ponto flutuante (Sebesta 6.2.1.2, p. 237)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node flutuante.js   (ou cole no console do navegador, F12)
console.log(0.1 + 0.2);                 // 0.30000000000000004
console.log(0.1 + 0.2 === 0.3);         // false

let soma = 0;
for (let i = 0; i < 10; i++) soma += 0.1;
console.log(soma);                      // 0.9999999999999999

// Comparar com tolerância, nunca com ===
console.log(Math.abs((0.1 + 0.2) - 0.3) < Number.EPSILON); // true

// JavaScript tem UM tipo numérico: double IEEE 754
console.log(Number.MAX_SAFE_INTEGER);   // 9007199254740991
console.log(2 ** 53 + 1);               // 9007199254740992  (o +1 sumiu!)
console.log(2n ** 53n + 1n);            // 9007199254740993n (BigInt)
console.log(typeof 1, typeof 1.5, typeof 1n); // number number bigint

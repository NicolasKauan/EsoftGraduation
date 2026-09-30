// Autopesquisa - Matrizes associativas (Sebesta 6.6, p. 259-263)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node associativas.js
const idades = new Map([["ana", 20], ["bia", 22]]);
idades.set("caio", 19);
console.log(idades.get("zeca"));          // undefined
for (const [nome, idade] of idades) console.log(nome, idade);

// Objeto literal também serve de dicionário, mas cuidado com o protótipo:
const obj = {};
console.log("toString" in obj);           // true! herdado de Object.prototype
console.log(Object.hasOwn(obj, "toString")); // false

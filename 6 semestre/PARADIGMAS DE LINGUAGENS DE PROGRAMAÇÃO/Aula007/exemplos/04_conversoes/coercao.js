// Aula 07 - Coerção implícita em JavaScript (Sebesta 7.4.1, p. 311)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro; ou no console do navegador)
// Local:  node coercao.js
console.log("5" - 2);                   // 3    (o - só existe para números)
console.log("5" + 2);                   // 52   (o + prefere concatenar)
console.log("5" * "2");                 // 10
console.log(true + 1);                  // 2
console.log([] + []);                   // (texto vazio)
console.log([] + {});                   // [object Object]
console.log(null + 1, undefined + 1);   // 1 NaN
console.log("b" + "a" + +"a" + "a");    // baNaNa

// == faz coerção antes de comparar; === não
console.log(0 == "", 0 == "0", "" == "0");   // true true false  (não é transitivo!)
console.log(0 === "", 0 === "0");            // false false
console.log(Number("12px"), parseInt("12px")); // NaN 12

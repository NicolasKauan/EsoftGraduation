// Aula 06 - Cadeias de caracteres (Sebesta 6.3, p. 240-244)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node cadeias.js
const s = "ação";
console.log(s.length);                           // 4 (unidades UTF-16)
console.log("👍".length);                        // 2
console.log([..."👍"].length);                   // 1 (o iterador percorre code points)
console.log(new TextEncoder().encode(s).length); // 6 bytes em UTF-8
console.log(s[1], s.at(-1));                     // ç o

s[0] = "A";                   // ignorado (em modo estrito: TypeError): string é imutável
console.log(s);               // ação
console.log(s.toUpperCase()); // AÇÃO (nova string)

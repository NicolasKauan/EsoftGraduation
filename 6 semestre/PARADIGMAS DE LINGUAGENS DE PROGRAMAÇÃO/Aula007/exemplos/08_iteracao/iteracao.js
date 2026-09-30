// Aula 07 - Iteração baseada em estruturas de dados (Sebesta 8.3.4, p. 349-352)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node iteracao.js
const notas = [10, 20, 30];

let total = 0;
for (const i in notas) total += i;   // for...in percorre as CHAVES (que são strings!)
console.log(total);                  // 0012

total = 0;
for (const v of notas) total += v;   // for...of percorre os VALORES
console.log(total);                  // 60

notas.forEach((v, i) => console.log(i, v));   // iterador interno (como os blocos de Ruby, p. 349)

// Gerador: qualquer objeto iterável funciona no for...of
function* contagem(n) {
  for (let i = n; i > 0; i--) yield i;
}
console.log([...contagem(3)]);       // [ 3, 2, 1 ]

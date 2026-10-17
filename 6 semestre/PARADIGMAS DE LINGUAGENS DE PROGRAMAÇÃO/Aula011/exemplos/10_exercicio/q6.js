// Exercício Aula 11 - Questão 6: o que acontece?
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
async function f() {
  throw new Error("falhou");
}

try {
  f();
} catch (e) {
  console.log("capturado");
}
console.log("fim");

// Aula 11 - Mesmo cenário: converter um texto e dividir 100 por ele (JavaScript)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro; ou no console do navegador)
// Local:  node dividir.js
function dividirCem(texto) {
  const n = Number(texto);     // "abc" vira NaN: NÃO lança exceção
  return 100 / n;              // 100 / 0 = Infinity: também NÃO lança
}

for (const entrada of ["4", "0", "abc"]) {
  console.log(entrada, "->", dividirCem(entrada));
}

function dividirCemSeguro(texto) {   // em JS, é preciso verificar e LANÇAR à mão
  const n = Number(texto);
  if (Number.isNaN(n)) throw new TypeError(`não é um número: ${texto}`);
  if (n === 0) throw new RangeError("divisão por zero");
  return Math.trunc(100 / n);
}

for (const entrada of ["4", "0", "abc"]) {
  try {
    console.log(entrada, "->", dividirCemSeguro(entrada));
  } catch (e) {
    console.log(entrada, "->", `${e.name}: ${e.message}`);
  }
}

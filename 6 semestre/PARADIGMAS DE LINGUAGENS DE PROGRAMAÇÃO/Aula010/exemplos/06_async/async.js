// Aula 10 - async/await: concorrência sem paralelismo
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node async.js
const espera = (ms, valor) => new Promise((r) => setTimeout(() => r(valor), ms));
const decorrido = (t) => `${Math.round((Date.now() - t) / 100) * 100} ms`;

async function sequencial() {
  const t = Date.now();
  const a = await espera(300, "A");       // espera terminar...
  const b = await espera(300, "B");       // ...antes de começar a próxima
  const c = await espera(300, "C");
  return `${a}${b}${c} em ~${decorrido(t)}`;
}

async function concorrente() {
  const t = Date.now();
  const [a, b, c] = await Promise.all([espera(300, "A"), espera(300, "B"), espera(300, "C")]);
  return `${a}${b}${c} em ~${decorrido(t)}`;
}

(async () => {
  console.log("sequencial: ", await sequencial());    // ~900 ms
  console.log("concorrente:", await concorrente());   // ~300 ms, com UMA só linha de execução
})();

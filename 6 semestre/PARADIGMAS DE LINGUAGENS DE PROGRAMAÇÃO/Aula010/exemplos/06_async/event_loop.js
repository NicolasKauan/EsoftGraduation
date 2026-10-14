// Aula 10 - JavaScript: uma única linha de execução e um laço de eventos
// Online: https://onecompiler.com/nodejs  (cole o código inteiro; ou no console do navegador)
// Local:  node event_loop.js
console.log("1: início");
setTimeout(() => console.log("4: setTimeout (fila de tarefas)"), 0);
Promise.resolve().then(() => console.log("3: promise (fila de microtarefas)"));
console.log("2: fim do código síncrono");

function ocupado(ms) {                 // laço ocupado: NÃO devolve o controle ao laço de eventos
  const t = Date.now();
  while (Date.now() - t < ms);
}

setTimeout(() => {
  const t0 = Date.now();
  setTimeout(() => {
    const atraso = Date.now() - t0;
    console.log(`5: um timer de 10 ms só rodou depois de ${atraso >= 200 ? "200 ms ou mais" : atraso + " ms"}`);
  }, 10);
  ocupado(200);                        // trava tudo: o timer de 10 ms precisa esperar
}, 0);

// Aula 11 - Exceções em código assíncrono (JavaScript)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node async_erros.js
function buscar(id) {
  return new Promise((resolve, reject) =>
    setTimeout(() => (id > 0 ? resolve({ id, nome: "Ana" }) : reject(new Error("id inválido"))), 50));
}

// 1) Promise com .catch
buscar(-1)
  .then((u) => console.log("ok", u))
  .catch((e) => console.log("1) catch da promise:", e.message));

// 2) async/await com try/catch: parece código síncrono
async function principal() {
  try {
    const u = await buscar(1);
    console.log("2) usuário:", u.nome);
    await buscar(0);
  } catch (e) {
    console.log("2) try/catch com await:", e.message);
  } finally {
    console.log("2) finally também funciona com await");
  }
}
principal();

// 3) Armadilha: try/catch SEM await não captura o erro assíncrono
process.on("unhandledRejection", (e) => console.log("3) rejeição NÃO tratada:", e.message));
try {
  buscar(-5);                  // faltou o await: a rejeição acontece depois que o try terminou
} catch (e) {
  console.log("nunca chega aqui");
}

// Aula 11 - Eventos no Node.js: EventEmitter (Sebesta 14.5, p. 616-617)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node eventos.js
const { EventEmitter } = require("events");

const loja = new EventEmitter();
loja.on("pedido", (p) => console.log(`estoque: separar ${p.qtd}x ${p.item}`));
loja.on("pedido", (p) => console.log(`e-mail: pedido de ${p.cliente} recebido`));
loja.once("pedido", () => console.log("primeiro pedido do dia!"));   // tratador de uso único

loja.emit("pedido", { cliente: "Ana", item: "livro", qtd: 2 });
loja.emit("pedido", { cliente: "Bia", item: "caneta", qtd: 5 });

loja.on("error", (e) => console.log("tratador de erro:", e.message));
loja.emit("error", new Error("pagamento recusado"));   // sem tratador de "error", o Node encerraria

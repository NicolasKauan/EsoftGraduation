// Aula 11 - Eventos no navegador e sua PROPAGAÇÃO (Sebesta 14.5, p. 616-617)
// Como executar: abra QUALQUER página no navegador, aperte F12, vá na aba Console, cole e tecle Enter.
// (Não roda no OneCompiler: precisa do DOM de uma página.)
const caixa = document.createElement("div");
const botao = document.createElement("button");
botao.textContent = "Clique aqui";
caixa.style.cssText = "padding:20px;background:#e6f4f1;position:fixed;top:10px;left:10px;z-index:9999";
caixa.appendChild(botao);
document.body.appendChild(caixa);

botao.addEventListener("click", (e) => console.log("1) tratador do BOTÃO:", e.type));
caixa.addEventListener("click", () => console.log("2) tratador da CAIXA: o evento subiu"));
document.body.addEventListener("click", () => console.log("3) tratador do BODY"));

botao.click();   // dispara o evento por código; depois clique com o mouse
// Para o evento não subir: chame e.stopPropagation() no tratador do botão

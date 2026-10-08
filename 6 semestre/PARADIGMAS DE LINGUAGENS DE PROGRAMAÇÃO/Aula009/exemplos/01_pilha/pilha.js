// Aula 09 - O TAD pilha em JavaScript: campos privados com # (Sebesta 11.2-11.4)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node pilha.js
class Pilha {
  #dados = [];                        // campo privado de verdade (ES2022)

  empilhar(x) { this.#dados.push(x); }
  desempilhar() {
    if (this.vazia()) throw new Error("pilha vazia");
    return this.#dados.pop();
  }
  topo() { return this.#dados.at(-1); }
  vazia() { return this.#dados.length === 0; }
  get tamanho() { return this.#dados.length; }   // propriedade só de leitura
}

const p = new Pilha();
p.empilhar(42);
p.empilhar(29);
console.log("29 is:", p.topo());
p.desempilhar();
console.log("42 is:", p.topo(), "tamanho:", p.tamanho);
console.log(p.dados);                 // undefined: #dados não é uma propriedade comum
// console.log(p.#dados);             // ERRO de sintaxe fora da classe

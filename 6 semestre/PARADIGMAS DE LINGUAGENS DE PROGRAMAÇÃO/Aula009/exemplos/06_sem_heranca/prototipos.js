// Aula 09 - OO baseada em protótipos: JavaScript
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node prototipos.js
// Em JavaScript, objetos herdam de OUTROS OBJETOS (protótipos), e não de classes
const animal = {
  falar() { return `${this.nome} faz ${this.som}`; },
};
const cachorro = Object.create(animal);      // o protótipo de cachorro é animal
cachorro.nome = "Rex";
cachorro.som = "au";
console.log(cachorro.falar());               // Rex faz au (falar vem do protótipo)
console.log(Object.getPrototypeOf(cachorro) === animal);   // true

animal.dormir = function () { return `${this.nome} dorme`; };   // alterar o protótipo...
console.log(cachorro.dormir());              // ...afeta quem já existe: Rex dorme

// "class" (ES2015) é uma sintaxe mais amigável sobre protótipos
class Gato { falar() { return "miau"; } }
console.log(typeof Gato, Object.getPrototypeOf(new Gato()) === Gato.prototype);   // function true

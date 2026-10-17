// Aula 12 - Exercício 2: reescreva o laço com filter e map
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
const alunos = [
  { nome: "Ana", nota: 8.5 },
  { nome: "Bruno", nota: 5.0 },
  { nome: "Carla", nota: 7.0 },
  { nome: "Davi", nota: 9.5 },
];
const aprovados = [];
for (let i = 0; i < alunos.length; i++) {
  if (alunos[i].nota >= 6) {
    aprovados.push(alunos[i].nome.toUpperCase());
  }
}
console.log(aprovados.join(", "));

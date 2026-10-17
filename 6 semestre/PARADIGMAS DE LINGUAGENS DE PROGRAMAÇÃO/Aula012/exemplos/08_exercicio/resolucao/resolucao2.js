// Aula 12 - Exercício 2: resolução
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
const alunos = [
  { nome: "Ana", nota: 8.5 },
  { nome: "Bruno", nota: 5.0 },
  { nome: "Carla", nota: 7.0 },
  { nome: "Davi", nota: 9.5 },
];

const aprovados = [];                                   // imperativo
for (let i = 0; i < alunos.length; i++) {
  if (alunos[i].nota >= 6) {
    aprovados.push(alunos[i].nome.toUpperCase());
  }
}

const aprovados2 = alunos                               // funcional
  .filter((a) => a.nota >= 6)
  .map((a) => a.nome.toUpperCase());

console.log(aprovados.join(", "));                      // ANA, CARLA, DAVI
console.log(aprovados2.join(", "));                     // ANA, CARLA, DAVI

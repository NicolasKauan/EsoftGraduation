// Aula 08 - Qual ambiente usa um subprograma passado como parâmetro? (Sebesta 9.6, p. 392-393)
// Online: https://onecompiler.com/nodejs  (cole o código inteiro)
// Local:  node vinculacao.js
// Exemplo do próprio livro, com console.log no lugar de alert.
function sub1() {
  var x;
  function sub2() {
    console.log("x =", x);   // qual x? o de sub1 (1), o de sub3 (3) ou o de sub4 (4)?
  }
  function sub3() {
    var x;
    x = 3;
    sub4(sub2);
  }
  function sub4(subx) {
    var x;
    x = 4;
    subx();
  }
  x = 1;
  sub3();
}

sub1();   // x = 1: vinculação PROFUNDA (o ambiente onde sub2 foi DEFINIDO)

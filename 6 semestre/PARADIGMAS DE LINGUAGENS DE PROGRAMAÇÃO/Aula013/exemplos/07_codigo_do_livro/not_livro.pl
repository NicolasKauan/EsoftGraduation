% Aula 13 - O segundo sibling da p. 714 do Sebesta (11ª ed.), com not/1
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% No GNU Prolog (OneCompiler) este arquivo NÃO COMPILA: not/1 não existe.
% No SWI-Prolog (SWISH), roda. Desafio: qual é a negação do padrão ISO?
:- initialization(main).

parent(bill, jake).
parent(bill, shelley).
sibling(X, Y) :- parent(M, X), parent(M, Y), not(X = Y).

main :- sibling(X, Y), write(X-Y), nl.

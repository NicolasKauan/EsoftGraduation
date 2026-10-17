% Aula 13 - O primeiro sibling da p. 714 do Sebesta (11ª ed.), copiado COMO ESTÁ IMPRESSO
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% ESTE ARQUIVO NÃO COMPILA DE PROPÓSITO. Desafio: leia a mensagem de erro e conte os parênteses.
:- initialization(main).

parent(bill, jake).
parent(bill, shelley).
sibling(X, Y) :- (parent(M, X), parent(M, Y).

main :- sibling(X, Y), write(X-Y), nl.

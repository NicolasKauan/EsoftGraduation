% Aula 13 - O sorted da p. 716 do Sebesta (11ª ed.), copiado COMO ESTÁ IMPRESSO
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% ESTE ARQUIVO NÃO COMPILA DE PROPÓSITO. Desafio: há DOIS problemas. Dica: como se escreve
% uma variável em Prolog? E qual é o operador "menor ou igual"?
:- initialization(main).

sorted ([]).
sorted ([x]).
sorted ([x, y | list]) :- x <= y, sorted ([y | list]).

main :- sorted([1, 2, 3]), write(yes), nl.

% Aula 13 - A mesma lógica, outra ordem: laço infinito (Sebesta 16.7.1, p. 711)
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% ESTE PROGRAMA TERMINA COM ERRO DE PROPÓSITO: "local stack overflow".
% Compare com ancestral em ordem_e_corte.pl: só a ordem dos objetivos mudou.
:- initialization(main).

pai(ana, bia).
pai(bia, caio).

ancestral(X, Y) :- ancestral(Z, Y), pai(X, Z).   % recursão À ESQUERDA
ancestral(X, Y) :- pai(X, Y).

main :-
    write('?- ancestral(ana, caio).'), nl,
    ancestral(ana, caio),
    write('   yes'), nl.

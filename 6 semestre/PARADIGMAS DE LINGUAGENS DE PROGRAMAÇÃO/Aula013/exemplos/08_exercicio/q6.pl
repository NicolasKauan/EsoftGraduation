% Aula 13 - Exercício 6: ordem das cláusulas
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
:- initialization(main).

ancestral(X, Y) :- ancestral(Z, Y), pai(X, Z).
ancestral(X, Y) :- pai(X, Y).
pai(ana, bia).

main :-
    write('?- ancestral(ana, bia).'), nl,
    ancestral(ana, bia),
    write('   yes'), nl.

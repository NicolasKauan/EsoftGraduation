% Aula 13 - Como o Prolog procura: profundidade e retrocesso
% (Sebesta 16.6.5, p. 700-705, e Figura 16.1)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

likes(jake, chocolate).
likes(jake, apricots).
likes(darcie, licorice).
likes(darcie, apricots).
likes(bob, pizza).                 % acrescentado (não está no livro)

% Rastreador com as 4 portas do livro (p. 704-705): chama, sai, refaz e falha.
% No SWISH, dá para usar o trace de verdade; aqui ele é imitado com write.
rastreia(G) :-
    (   write('   Chama:  '), write(G), nl
    ;   write('   Falha:  '), write(G), nl, fail
    ),
    call(G),
    (   write('   Sai:    '), write(G), nl
    ;   write('   Refaz:  '), write(G), nl, fail
    ).

main :-
    write('?- likes(jake, X), likes(darcie, X).'), nl,
    (   rastreia(likes(jake, X)), rastreia(likes(darcie, X))
    ->  write('   X = '), write(X), nl
    ;   write('   no'), nl
    ),
    nl,
    write('?- likes(jake, Y), likes(bob, Y).'), nl,
    (   rastreia(likes(jake, Y)), rastreia(likes(bob, Y))
    ->  write('   Y = '), write(Y), nl
    ;   write('   no'), nl
    ).

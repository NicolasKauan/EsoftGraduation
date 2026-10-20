% Aula 13 - Mundo fechado e o problema da negação (Sebesta 16.7.2 e 16.7.3, p. 713-715)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

parent(bill, jake).
parent(bill, shelley).

% O livro usa not/1, que o SWI-Prolog tem, mas o GNU Prolog não (o padrão ISO usa \+).
% Definimos not para seguir o texto do livro:
not(G) :- \+ G.

sibling_ingenuo(X, Y) :- parent(M, X), parent(M, Y).              % p. 714
sibling(X, Y) :- parent(M, X), parent(M, Y), not(X = Y).          % p. 714

aluno(ana).
aluno(bruno).

main :-
    consulta('sibling_ingenuo(X, Y).', ['X' = X1, 'Y' = Y1], sibling_ingenuo(X1, Y1)),
    consulta('sibling(X, Y).', ['X' = X2, 'Y' = Y2], sibling(X2, Y2)),
    % Mundo fechado (p. 713): o que não se pode provar é considerado falso
    consulta('aluno(carla).', [], aluno(carla)),
    consulta('not(aluno(carla)).', [], not(aluno(carla))),
    % not(not(G)) não é G (p. 715): a instanciação de X se perde
    consulta('member(X, [mary, fred, barb]).', ['X' = X3], member(X3, [mary, fred, barb])),
    consulta('not(not(member(X, [mary, fred, barb]))).', ['X' = X4],
             not(not(member(X4, [mary, fred, barb])))),
    % Com negação, a ordem dos objetivos muda a resposta
    consulta('X = b, not(X = a).', ['X' = X5], (X5 = b, not(X5 = a))),
    consulta('not(X = a), X = b.', ['X' = X6], (not(X6 = a), X6 = b)).

% ---------------------------------------------------------------------------
% Apoio para executar sem o modo interativo (não faz parte do exemplo):
% mostra a consulta e todas as respostas, como se o usuário apertasse ";".
consulta(Texto, Vars, Objetivo) :-
    write('?- '), write(Texto), nl,
    findall(Vars, Objetivo, Respostas),
    mostra(Vars, Respostas).

mostra(_, []) :- !, write('   no'), nl.
mostra([], _) :- !, write('   yes'), nl.
mostra(_, Respostas) :- mostra_cada(Respostas).

mostra_cada([]).
mostra_cada([R | Rs]) :- write('   '), escreve(R), nl, mostra_cada(Rs).

escreve([V]) :- !, write(V).
escreve([V | Vs]) :- write(V), write(', '), escreve(Vs).

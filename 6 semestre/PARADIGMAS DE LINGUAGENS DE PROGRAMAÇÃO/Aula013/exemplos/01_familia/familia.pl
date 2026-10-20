% Aula 13 - Fatos, regras e consultas: a família do livro (Sebesta 16.6.2-16.6.4, p. 697-700)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

% Fatos (p. 698): cláusulas de Horn sem cabeça. Todo fato termina com ponto.
% O livro alterna female e male; aqui as cláusulas de cada predicado ficam JUNTAS,
% porque o GNU Prolog ignora as que ficam separadas (veja 07_codigo_do_livro/familia_livro.pl).
% Os fatos marcados com "+" não estão no livro: foram acrescentados para existirem netos.
female(shelley).
female(mary).
female(ana).                % +
male(bill).
male(jake).
male(tom).                  % +
father(bill, jake).
father(bill, shelley).
father(jake, tom).          % +
mother(mary, jake).
mother(mary, shelley).
mother(shelley, ana).       % +

% Regras (p. 699): consequente :- antecedente.  A vírgula é o E.
parent(X, Y) :- mother(X, Y).
parent(X, Y) :- father(X, Y).
grandparent(X, Z) :- parent(X, Y), parent(Y, Z).

% Recursão: X é ancestral de Y se é pai/mãe de Y, ou pai/mãe de um ancestral de Y
ancestor(X, Y) :- parent(X, Y).
ancestor(X, Y) :- parent(X, Z), ancestor(Z, Y).

% Irmãos (p. 714): mesmo pai ou mãe, e pessoas diferentes.
% O livro usa not(X = Y); no padrão ISO (e no GNU Prolog) a negação é \+
sibling(X, Y) :- parent(M, X), parent(M, Y), \+ X = Y.

main :-
    consulta('father(bill, jake).', [], father(bill, jake)),
    consulta('father(bill, mary).', [], father(bill, mary)),
    consulta('father(X, jake).', ['X' = X1], father(X1, jake)),
    consulta('parent(X, shelley).', ['X' = X2], parent(X2, shelley)),
    consulta('male(X), parent(X, shelley).', ['X' = X3], (male(X3), parent(X3, shelley))),
    consulta('grandparent(G, N).', ['G' = G, 'N' = N], grandparent(G, N)),
    consulta('ancestor(A, tom).', ['A' = A], ancestor(A, tom)),
    consulta('sibling(jake, S).', ['S' = S], sibling(jake, S)).

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

% Aula 13 - A ordem das cláusulas importa, e o corte (Sebesta 16.7.1, p. 711-713)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

pai(ana, bia).
pai(bia, caio).

% Base primeiro e recursão à direita: funciona
ancestral(X, Y) :- pai(X, Y).
ancestral(X, Y) :- pai(X, Z), ancestral(Z, Y).
% A MESMA lógica com a recursão à esquerda nunca termina: veja laco_infinito.pl

% Corte (p. 712): depois de achar o elemento, não procura de novo
membro_corte(E, [E | _]) :- !.
membro_corte(E, [_ | L]) :- membro_corte(E, L).

% divide do livro (p. 713): gerar e testar.
% is_integer não é predefinido; esta definição gera 0, 1, 2, ... (Clocksin e Mellish)
is_integer(0).
is_integer(X) :- is_integer(Y), X is Y + 1.

divide(N1, N2, Result) :-
    is_integer(Result),                    % gera
    Product1 is Result * N2,               % testa
    Product2 is (Result + 1) * N2,
    Product1 =< N1, Product2 > N1, !.      % sem este corte, pedir todas as respostas nunca termina

main :-
    consulta('ancestral(ana, caio).', [], ancestral(ana, caio)),
    consulta('ancestral(ana, D).', ['D' = D], ancestral(ana, D)),
    consulta('member(X, [a, b, a]).', ['X' = X1], member(X1, [a, b, a])),
    consulta('membro_corte(X, [a, b, a]).', ['X' = X2], membro_corte(X2, [a, b, a])),
    consulta('divide(17, 5, R).', ['R' = R], divide(17, 5, R)).

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

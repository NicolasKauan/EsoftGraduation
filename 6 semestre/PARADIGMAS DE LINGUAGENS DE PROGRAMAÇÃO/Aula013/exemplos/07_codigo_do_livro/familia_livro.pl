% Aula 13 - Os fatos da p. 698 do Sebesta (11ª ed.), NA ORDEM DO LIVRO
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% Execute e compare as respostas com os fatos. Desafio: por que female(mary) e male(jake)
% "sumiram"? (No SWISH, as respostas vêm completas, com um aviso.)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

female(shelley).
male(bill).
female(mary).
male(jake).
father(bill, jake).
father(bill, shelley).
mother(mary, jake).
mother(mary, shelley).

main :-
    consulta('female(X).', ['X' = X], female(X)),
    consulta('male(X).', ['X' = Y], male(Y)).

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

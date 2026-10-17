% Aula 13 - Listas em Prolog: [Cabeça | Cauda], append e reverse (Sebesta 16.6.7, p. 706-711)
% No GNU Prolog, append/3, member/2 e reverse/2 já existem e NÃO podem ser redefinidos.
% Por isso as versões do livro estão com nomes em português (anexar, membro).
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

new_list([apple, prune, grape, kumquat]).        % p. 706
new_list([apricot, peach, pear]).

% append do livro (p. 708)
anexar([], List, List).
anexar([Head | List_1], List_2, [Head | List_3]) :-
    anexar(List_1, List_2, List_3).

% list_op_2 do livro (p. 709): o que ela faz?
list_op_2([], []).
list_op_2([Head | Tail], List) :-
    list_op_2(Tail, Result), anexar(Result, [Head], List).

% member do livro (p. 710). O _ é a variável anônima.
membro(Element, [Element | _]).
membro(Element, [_ | List]) :- membro(Element, List).

main :-
    consulta('new_list([H | T]).', ['H' = H, 'T' = T], new_list([H | T])),
    consulta('[X | Y] = [a, b, c].', ['X' = X1, 'Y' = Y1], [X1 | Y1] = [a, b, c]),
    consulta('anexar([bob, jo], [jake, darcie], Family).', ['Family' = F],
             anexar([bob, jo], [jake, darcie], F)),
    consulta('anexar(X, Y, [a, b, c]).', ['X' = X2, 'Y' = Y2], anexar(X2, Y2, [a, b, c])),
    consulta('list_op_2([apple, orange, grape], Q).', ['Q' = Q], list_op_2([apple, orange, grape], Q)),
    consulta('membro(a, [b, c, d]).', [], membro(a, [b, c, d])),
    consulta('membro(a, [b, a, c]).', [], membro(a, [b, a, c])),
    consulta('membro(X, [mary, fred, barb]).', ['X' = X3], membro(X3, [mary, fred, barb])),
    consulta('append(X, [c], [a, b, c]).', ['X' = X4], append(X4, [c], [a, b, c])).

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

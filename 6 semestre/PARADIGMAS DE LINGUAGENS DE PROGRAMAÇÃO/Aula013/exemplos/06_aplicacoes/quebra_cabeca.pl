% Aula 13 - Quebra-cabeça lógico: gerar e testar (Sebesta 16.7.1, p. 712-713)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

% Ana, Bruno e Carla preferem, cada um, uma linguagem diferente: haskell, java ou prolog.
%  1. Ana não prefere java.
%  2. Bruno não prefere haskell.
%  3. Carla não prefere prolog.
%  4. Ana não prefere prolog.
% Quem prefere o quê?
solucao(Ana, Bruno, Carla) :-
    permutation([haskell, java, prolog], [Ana, Bruno, Carla]),   % gera
    Ana \== java,                                                % testa
    Bruno \== haskell,
    Carla \== prolog,
    Ana \== prolog.

main :-
    consulta('solucao(Ana, Bruno, Carla).', ['Ana' = A, 'Bruno' = B, 'Carla' = C], solucao(A, B, C)).

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

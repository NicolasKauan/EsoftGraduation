% Aula 13 - Aritmética em Prolog: is, = e =:= (Sebesta 16.6.6, p. 703-705)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

% O exemplo do livro (p. 704)
speed(ford, 100).
speed(chevy, 105).
speed(dodge, 95).
speed(volvo, 80).
time(ford, 20).
time(chevy, 21).
time(dodge, 24).
time(volvo, 24).

distance(X, Y) :- speed(X, Speed), time(X, Time), Y is Speed * Time.

% Recursão com aritmética: sem laço e sem atribuição
fatorial(0, 1).
fatorial(N, F) :- N > 0, N1 is N - 1, fatorial(N1, F1), F is N * F1.

% Questão de revisão 17 (p. 719): o que há de errado em K is K + 1?
incrementa(K) :- K is K + 1.

main :-
    consulta('distance(chevy, Chevy_Distance).', ['Chevy_Distance' = D1], distance(chevy, D1)),
    consulta('distance(Carro, D), D > 2200.', ['Carro' = C, 'D' = D2], (distance(C, D2), D2 > 2200)),
    consulta('X = 2 + 3.', ['X' = X1], X1 = 2 + 3),
    consulta('X is 2 + 3.', ['X' = X2], X2 is 2 + 3),
    consulta('5 = 2 + 3.', [], 5 = 2 + 3),
    consulta('5 =:= 2 + 3.', [], 5 =:= 2 + 3),
    consulta('X = 3, X is 1 + 2.', ['X' = X3], (X3 = 3, X3 is 1 + 2)),
    consulta('fatorial(10, F).', ['F' = F1], fatorial(10, F1)),
    % O GNU Prolog usa inteiros de 60 bits e NÃO avisa o estouro (o certo é 2432902008176640000)
    consulta('fatorial(20, F).', ['F' = F2], fatorial(20, F2)),
    consulta('incrementa(5).', [], incrementa(5)),
    write('?- incrementa(K).'), nl,
    catch(incrementa(_), Erro, (write('   erro: '), write(Erro), nl)).

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

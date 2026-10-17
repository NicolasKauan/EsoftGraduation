% Aula 13 - Limitações intrínsecas: ordenar descrevendo o resultado
% (Sebesta 16.4 e 16.7.4, p. 695-696 e 716)
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% "A lista ordenada é uma permutação da original em que cada elemento é <= o seguinte."
% A descrição está correta, mas o Prolog só sabe testar permutações, uma de cada vez.
:- initialization(main).

ordenada([]).
ordenada([_]).
ordenada([X, Y | Resto]) :- X =< Y, ordenada([Y | Resto]).

ordena_lento(Lista, Ordenada) :- permutation(Lista, Ordenada), ordenada(Ordenada), !.

decrescente(0, []) :- !.
decrescente(N, [N | T]) :- N1 is N - 1, decrescente(N1, T).

mede(N) :-
    decrescente(N, L),
    statistics(runtime, [T0, _]),
    ordena_lento(L, _),
    statistics(runtime, [T1, _]),
    T is T1 - T0,
    write('n = '), write(N), write(': '), write(T), write(' ms'), nl.

main :-
    ordena_lento([3, 1, 2], S), write(S), nl,
    mede(6), mede(7), mede(8), mede(9), mede(10),
    decrescente(10000, Grande),
    statistics(runtime, [T0, _]),
    msort(Grande, _),
    statistics(runtime, [T1, _]),
    T is T1 - T0,
    write('msort (predefinido) com n = 10000: '), write(T), write(' ms'), nl.

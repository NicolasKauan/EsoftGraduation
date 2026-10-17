% Aula 13 - Prática de Prolog: uma resolução possível
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
:- initialization(main).

tamanho([], 0).
tamanho([_ | T], N) :- tamanho(T, N1), N is N1 + 1.

soma([], 0).
soma([H | T], S) :- soma(T, S1), S is S1 + H.

ultimo([X], X).
ultimo([_ | T], X) :- ultimo(T, X).

confere(Nome, Obtido, Esperado) :-
    write(Nome), write(': '), write(Obtido),
    (   Obtido == Esperado
    ->  write('  ok')
    ;   write('  (esperado '), write(Esperado), write(')')
    ),
    nl.

main :-
    tamanho([a, b, c], N), confere(tamanho, N, 3),
    soma([1, 2, 3, 4], S), confere(soma, S, 10),
    ultimo([a, b, c], U), confere(ultimo, U, c),
    % As relações também funcionam "ao contrário": que listas têm tamanho 2?
    tamanho(L, 2), !, write('tamanho(L, 2): L = '), write(L), nl.

% Aula 13 - Prática de Prolog: complete as três relações
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% Troque cada linha marcada com "complete aqui" (pode precisar de duas cláusulas)
% e execute de novo até aparecer "ok" nas três linhas.
% Dica: siga o modelo de membro e anexar (listas.pl): o caso da lista vazia e o caso [H | T].
:- initialization(main).

% 1) tamanho(Lista, N): N é o número de elementos     tamanho([a, b, c], N) => N = 3
tamanho(_, 0).                                % complete aqui

% 2) soma(Lista, S): S é a soma dos números            soma([1, 2, 3, 4], S) => S = 10
soma(_, 0).                                   % complete aqui

% 3) ultimo(Lista, U): U é o último elemento           ultimo([a, b, c], U) => U = c
ultimo(_, nada).                              % complete aqui

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
    ultimo([a, b, c], U), confere(ultimo, U, c).

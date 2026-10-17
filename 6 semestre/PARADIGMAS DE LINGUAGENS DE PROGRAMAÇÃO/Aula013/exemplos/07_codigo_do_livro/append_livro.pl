% Aula 13 - O append da p. 708 do Sebesta (11ª ed.), com o nome do livro
% Online: https://onecompiler.com/prolog  (cole o código inteiro)
% No GNU Prolog (OneCompiler) este arquivo NÃO COMPILA: append/3 já existe e não pode ser
% redefinido. No SWI-Prolog (SWISH), roda. Desafio: como resolver sem mudar a lógica?
:- initialization(main).

append([], List, List).
append([Head | List_1], List_2, [Head | List_3]) :-
    append(List_1, List_2, List_3).

main :- append([bob, jo], [jake, darcie], Family), write(Family), nl.

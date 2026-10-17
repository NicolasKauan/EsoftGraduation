% Aula 13 - Prolog, SQL e Datalog: consultas declarativas (Sebesta 16.8.1, p. 716-717)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

% Tabelas como fatos:  aluno(Matricula, Nome, Curso)  e  nota(Matricula, Disciplina, Nota)
aluno(1, ana, es).
aluno(2, bruno, es).
aluno(3, carla, ads).
nota(1, paradigmas, 8.5).
nota(2, paradigmas, 5.0).
nota(3, paradigmas, 9.0).
nota(1, banco_de_dados, 7.0).

% SELECT a.nome FROM aluno a JOIN nota n ON a.matricula = n.matricula
%  WHERE n.disciplina = 'paradigmas' AND n.nota >= 6;
aprovado(Nome, Disciplina) :- aluno(M, Nome, _), nota(M, Disciplina, N), N >= 6.

% Datalog: o fecho transitivo, que em SQL exige WITH RECURSIVE.
% É o tipo de consulta que ferramentas como o CodeQL fazem sobre o código-fonte.
depende(app, web).
depende(web, http).
depende(http, socket).
depende(app, log).

depende_de(A, B) :- depende(A, B).
depende_de(A, B) :- depende(A, C), depende_de(C, B).

main :-
    consulta('aprovado(Nome, paradigmas).', ['Nome' = N1], aprovado(N1, paradigmas)),
    consulta('aluno(M, Nome, es).', ['M' = M, 'Nome' = N2], aluno(M, N2, es)),
    consulta('depende_de(app, X).', ['X' = X], depende_de(app, X)),
    consulta('depende_de(Quem, socket).', ['Quem' = Q], depende_de(Q, socket)).

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

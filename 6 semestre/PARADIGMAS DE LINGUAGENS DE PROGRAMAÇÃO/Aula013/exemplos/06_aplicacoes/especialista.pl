% Aula 13 - Um sistema especialista mínimo (Sebesta 16.8.2, p. 717-718)
% Online: https://onecompiler.com/prolog  (cole o código inteiro; o OneCompiler usa o GNU Prolog)
% Também roda no SWISH (https://swish.swi-prolog.org), onde dá para digitar outras consultas.
:- initialization(main).

% Sintomas observados: é a "entrada". Troque e execute de novo.
sintoma(site_fora_do_ar).
sintoma(ping_responde).
sintoma(porta_80_fechada).

% Regras do especialista. O segundo parâmetro EXPLICA a conclusão,
% como o sistema APES citado pelo livro (p. 717).
diagnostico(servidor_desligado, [site_fora_do_ar, 'ping não responde']) :-
    sintoma(site_fora_do_ar), \+ sintoma(ping_responde).
diagnostico(servico_web_parado, [site_fora_do_ar, ping_responde, porta_80_fechada]) :-
    sintoma(site_fora_do_ar), sintoma(ping_responde), sintoma(porta_80_fechada).
diagnostico(problema_de_dns, [site_fora_do_ar, ping_responde, 'porta 80 aberta']) :-
    sintoma(site_fora_do_ar), sintoma(ping_responde), \+ sintoma(porta_80_fechada).

acao(servidor_desligado, 'verificar a energia e ligar o servidor').
acao(servico_web_parado, 'reiniciar o servidor web (nginx, apache...)').
acao(problema_de_dns, 'verificar o registro DNS do domínio').

main :-
    consulta('diagnostico(D, Porque), acao(D, Acao).',
             ['D' = D, 'Porque' = P, 'Acao' = A],
             (diagnostico(D, P), acao(D, A))).

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

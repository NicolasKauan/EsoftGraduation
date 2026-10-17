; Aula 12 - Prática de Scheme: complete as três funções
; Online: https://onecompiler.com/scheme  (cole o código inteiro)
; Troque cada corpo marcado com "complete aqui" e execute de novo até aparecer "ok" nas três linhas.
; Dica: siga o modelo de membro e adder (recursao.scm): caso da lista vazia, depois car e cdr.

(define (confere nome obtido esperado)
  (display nome) (display ": ") (display obtido)
  (if (equal? obtido esperado)
      (display "  ok")
      (begin (display "  (esperado ") (display esperado) (display ")")))
  (newline))

; 1) quantos elementos a lista tem?   (tamanho '(a b c)) => 3
(define (tamanho lis)
  0)                                       ; complete aqui

; 2) soma dos quadrados               (soma-quadrados '(1 2 3)) => 14
(define (soma-quadrados lis)
  0)                                       ; complete aqui

; 3) só os números pares              (pares '(1 2 3 4 5 6)) => (2 4 6)   use even?
(define (pares lis)
  '())                                     ; complete aqui

(confere "tamanho" (tamanho '(a b c)) 3)
(confere "soma-quadrados" (soma-quadrados '(1 2 3)) 14)
(confere "pares" (pares '(1 2 3 4 5 6)) '(2 4 6))

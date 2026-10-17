; Aula 12 - Formas funcionais e código como dado em Scheme (Sebesta 15.5.13 e 15.5.14, p. 656-659)
; Online: https://onecompiler.com/scheme  (cole o código inteiro)

(define (mostra x) (display x) (newline))

; Composição (p. 657)
(define (compose f g) (lambda (x) (f (g x))))
(mostra ((compose car cdr) '((a b) c d)))  ; c    (o mesmo que cadr)
(mostra ((compose cdr car) '((a b) c d)))  ; (b)  (o mesmo que cdar)
(define (third a_list) ((compose car (compose cdr cdr)) a_list))
(mostra (third '(1 2 3 4)))                ; 3

; Aplicar-a-todos: o map do livro (p. 657), com outro nome
(define (mapear fun a_list)
  (cond ((null? a_list) '())
        (else (cons (fun (car a_list)) (mapear fun (cdr a_list))))))
(mostra (mapear (lambda (num) (* num num num)) '(3 4 2 6)))  ; (27 64 8 216)
(mostra (map (lambda (num) (* num num num)) '(3 4 2 6)))     ; o map predefinido

; Função que devolve função: currying (p. 666) e fechamento
(define (add y) (lambda (x) (+ y x)))
(mostra ((add 3) 4))                       ; 7
(define mais10 (add 10))
(mostra (mais10 5))                        ; 15

; Código como dado (p. 658-659): montar a lista (+ 3 4 5) e avaliá-la com eval.
; O Scheme atual exige o 2º parâmetro de eval, o ambiente (o livro o omite, p. 659).
(define (adder a_list)
  (cond ((null? a_list) 0)
        (else (eval (cons '+ a_list) (interaction-environment)))))
(mostra (cons '+ '(3 4 5)))                ; (+ 3 4 5): é só uma lista...
(mostra (adder '(3 4 5)))                  ; 12: ...até ser avaliada com eval
(mostra (apply + '(3 4 5)))                ; 12: apply faz o mesmo sem montar código

; Aula 12 - Scheme: o essencial (Sebesta 15.5, p. 641-650)
; Online: https://onecompiler.com/scheme  (cole o código inteiro; o OneCompiler usa o GNU Guile)
; No livro as palavras aparecem em maiúsculas (DEFINE, CAR); o Scheme atual usa minúsculas.

(define (mostra x) (display x) (newline))

; Notação prefixa (p. 642): o operador vem primeiro, e aceita vários operandos
(mostra (+ 3 7 10 2))              ; 22
(mostra (* 2 (+ 3 4)))             ; 14

; Definir um nome e uma função (p. 643-644)
(define pi 3.14159)
(define (quadrado x) (* x x))
(mostra (quadrado 5))              ; 25
(mostra (* pi (quadrado 2)))       ; 12.56636
(mostra ((lambda (x) (* x x x)) 2)) ; 8: a expressão lambda da p. 635

; Condicionais (p. 645-646)
(define (sinal n)
  (cond ((> n 0) 'positivo)
        ((< n 0) 'negativo)
        (else 'zero)))
(mostra (sinal -7))                ; negativo
(mostra (if (> 3 2) "sim" "não"))  ; sim

; Listas (p. 646-649): QUOTE, CAR, CDR, CONS e LIST
(mostra '(A B C))                  ; (A B C)  sem o apóstrofo, seria uma chamada à função A
(mostra (car '(A B C)))            ; A
(mostra (cdr '(A B C)))            ; (B C)
(mostra (cons 'A '(B C)))          ; (A B C)
(mostra (cons '(A B) '(C D)))      ; ((A B) C D)
(mostra (list 'A 'B '(C D)))       ; (A B (C D))
(mostra (car (cdr '(A B C))))      ; B  (o mesmo que cadr)

; Predicados (p. 645 e 649-650)
(mostra (null? '()))               ; #t
(mostra (list? '(1 2)))            ; #t
(mostra (eq? 'A 'A))               ; #t
(mostra (equal? '(1 2) '(1 2)))    ; #t

; LET (p. 654): nomes locais para valores, sem atribuição
(let ((a 3) (b 4))
  (mostra (sqrt (+ (* a a) (* b b)))))   ; 5

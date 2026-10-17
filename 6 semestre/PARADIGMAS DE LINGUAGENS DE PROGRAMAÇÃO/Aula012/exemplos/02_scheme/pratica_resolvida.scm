; Aula 12 - Prática de Scheme: uma resolução possível
; Online: https://onecompiler.com/scheme  (cole o código inteiro)

(define (confere nome obtido esperado)
  (display nome) (display ": ") (display obtido)
  (if (equal? obtido esperado)
      (display "  ok")
      (begin (display "  (esperado ") (display esperado) (display ")")))
  (newline))

(define (tamanho lis)
  (if (null? lis)
      0
      (+ 1 (tamanho (cdr lis)))))

(define (soma-quadrados lis)
  (if (null? lis)
      0
      (+ (* (car lis) (car lis)) (soma-quadrados (cdr lis)))))

(define (pares lis)
  (cond ((null? lis) '())
        ((even? (car lis)) (cons (car lis) (pares (cdr lis))))
        (else (pares (cdr lis)))))

(confere "tamanho" (tamanho '(a b c)) 3)
(confere "soma-quadrados" (soma-quadrados '(1 2 3)) 14)
(confere "pares" (pares '(1 2 3 4 5 6)) '(2 4 6))

; As mesmas funções com formas funcionais (map, filter, apply)
(confere "soma-quadrados 2" (apply + (map (lambda (x) (* x x)) '(1 2 3))) 14)
(confere "pares 2" (filter even? '(1 2 3 4 5 6)) '(2 4 6))

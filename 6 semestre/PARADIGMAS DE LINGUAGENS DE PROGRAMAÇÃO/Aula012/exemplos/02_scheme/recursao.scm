; Aula 12 - Recursão em Scheme: listas e recursão em cauda (Sebesta 15.5.10-15.5.12, p. 651-656)
; Online: https://onecompiler.com/scheme  (cole o código inteiro)

(define (mostra x) (display x) (newline))

; member do livro (p. 651). Com outro nome, porque member já existe.
(define (membro atm a_list)
  (cond ((null? a_list) #f)                ; o teste de lista vazia vem ANTES do car
        ((eq? atm (car a_list)) #t)
        (else (membro atm (cdr a_list)))))
(mostra (membro 'B '(A B C)))              ; #t
(mostra (membro 'B '(A C D E)))            ; #f

; append do livro (p. 653)
(define (anexar list1 list2)
  (cond ((null? list1) list2)
        (else (cons (car list1) (anexar (cdr list1) list2)))))
(mostra (anexar '(A B) '(C D R)))          ; (A B C D R)

; adder do livro (p. 658): soma de uma lista por recursão
(define (adder a_list)
  (cond ((null? a_list) 0)
        (else (+ (car a_list) (adder (cdr a_list))))))
(mostra (adder '(3 4 5)))                  ; 12

; Fatorial: recursão comum × recursão em cauda (p. 655-656)
(define (fatorial n)                       ; a multiplicação acontece NA VOLTA
  (if (<= n 1) 1 (* n (fatorial (- n 1)))))

(define (facthelper n factpartial)         ; a multiplicação acontece NA IDA
  (if (<= n 1)
      factpartial
      (facthelper (- n 1) (* n factpartial))))
(define (factorial n) (facthelper n 1))

(mostra (fatorial 20))                     ; 2432902008176640000
(mostra (factorial 30))                    ; inteiros sem limite de tamanho

; Scheme EXIGE que a recursão em cauda vire iteração (p. 656):
; um milhão de chamadas sem estourar a pilha
(define (conta-ate n acc)
  (if (= n 0) acc (conta-ate (- n 1) (+ acc 1))))
(mostra (conta-ate 1000000 0))             ; 1000000

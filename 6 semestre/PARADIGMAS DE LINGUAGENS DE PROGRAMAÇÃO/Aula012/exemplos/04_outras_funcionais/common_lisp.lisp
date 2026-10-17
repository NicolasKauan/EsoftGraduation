; Aula 12 - Common Lisp (Sebesta 15.6, p. 659-660)
; Online: https://onecompiler.com/commonlisp  (cole o código inteiro; o OneCompiler usa o SBCL)
; A versão de factorial impressa na p. 659 tem erros; esta é a corrigida (veja 07_codigo_do_livro).

(defun factorial (n)
  (if (<= n 1)
      1
      (* n (factorial (- n 1)))))

(print (factorial 20))                                   ; 2432902008176640000
(print (mapcar (lambda (x) (* x x x)) '(3 4 2 6)))       ; (27 64 8 216)
(print (reduce #'+ '(3 4 5)))                            ; 12
(print (remove-if-not #'evenp '(1 2 3 4 5 6)))           ; (2 4 6)
(print (funcall (lambda (x) (* x x x)) 2))               ; 8

; Common Lisp também tem construções imperativas (p. 659): laço e atribuição
(let ((soma 0))
  (loop for i from 1 to 10 do (setf soma (+ soma i)))
  (print soma))                                          ; 55

; Macros (p. 660): DOLIST é uma macro predefinida
(dolist (x '(1 2 3)) (print x))

; Crase (p. 660): como o QUOTE, mas o que vem depois da vírgula é avaliado
(print '(a (* 3 4) c))                                   ; (A (* 3 4) C)
(print `(a ,(* 3 4) c))                                  ; (A 12 C)

; Uma macro do usuário (DEFMACRO): recebe CÓDIGO e devolve código
(defmacro ao-contrario (&rest forma) (reverse forma))
(print (ao-contrario 3 4 +))                             ; vira (+ 4 3) = 7

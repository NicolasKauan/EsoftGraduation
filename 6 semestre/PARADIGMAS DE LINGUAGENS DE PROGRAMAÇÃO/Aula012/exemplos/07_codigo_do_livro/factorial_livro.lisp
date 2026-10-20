; Aula 12 - O factorial em Common Lisp da p. 659 do Sebesta (11ª ed.), copiado COMO ESTÁ IMPRESSO
; Online: https://onecompiler.com/commonlisp  (cole o código inteiro)
; ESTE ARQUIVO FALHA DE PROPÓSITO. Desafio: há DOIS erros. Leia os avisos do SBCL.

(DEFUN factorial (x)
  (IF (<= n 1)
    1
    (* n factorial (- n 1)))
)

(print (factorial 5))

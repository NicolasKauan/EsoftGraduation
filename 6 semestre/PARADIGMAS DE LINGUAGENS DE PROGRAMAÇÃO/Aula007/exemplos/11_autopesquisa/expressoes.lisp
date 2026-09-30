; Autopesquisa - Expressões em Lisp: notação prefixa, sem precedência (Sebesta 7.2.1.5, p. 306)
; Online: https://onecompiler.com/commonlisp  (cole o código inteiro)
; Local:  sbcl --script expressoes.lisp
(defvar a 3)
(defvar b 4)
(defvar c 5)
(format t "a + b * c   = ~a~%" (+ a (* b c)))     ; 23: os parênteses dizem a ordem
(format t "(a + b) * c = ~a~%" (* (+ a b) c))     ; 35
(format t "soma de 5   = ~a~%" (+ 1 2 3 4 5))     ; um operador, vários operandos
(format t "if          = ~a~%" (if (> a 0) a (* 2 a)))   ; expressão condicional

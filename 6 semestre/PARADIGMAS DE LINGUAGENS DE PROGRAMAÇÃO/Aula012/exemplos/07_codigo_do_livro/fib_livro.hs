-- Aula 12 - O fib da p. 667 do Sebesta (11ª ed.), copiado COMO ESTÁ IMPRESSO
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)
-- ESTE ARQUIVO NÃO COMPILA DE PROPÓSITO. O livro diz usar Haskell 1.4 (p. 667).
-- Desafio: por que o compilador atual recusa o padrão (n + 2)? Como reescrever?

fib 0 = 1
fib 1 = 1
fib (n + 2) = fib (n + 1) + fib n

main :: IO ()
main = print (map fib [0 .. 10])

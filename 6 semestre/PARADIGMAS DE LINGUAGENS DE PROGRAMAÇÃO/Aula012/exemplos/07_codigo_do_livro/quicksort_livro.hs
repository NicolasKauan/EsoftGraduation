-- Aula 12 - O quicksort da p. 669 do Sebesta (11ª ed.), copiado COMO ESTÁ IMPRESSO
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)
-- ESTE ARQUIVO NÃO COMPILA DE PROPÓSITO. Desafio: leia a mensagem de erro e ache o problema.

sort [] = []
sort (h:t) = sort [b | b <- t, b <- h]
             ++ [h] ++
             sort [b | b <- t, b > h]

main :: IO ()
main = print (sort [7, 2, 9, 4, 2, 8])

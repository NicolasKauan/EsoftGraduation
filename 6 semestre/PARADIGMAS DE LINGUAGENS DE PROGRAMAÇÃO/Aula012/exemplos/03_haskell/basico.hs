-- Aula 12 - Haskell: casamento de padrões, guardas, listas e compreensões (Sebesta 15.8, p. 666-669)
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)
-- Local:  runghc basico.hs
-- Nenhuma função abaixo declara tipos: o compilador INFERE todos (e verifica todos).

-- Casamento de padrões (p. 667)
fact 0 = 1
fact 1 = 1
fact n = n * fact (n - 1)

-- O livro escreve fib (n + 2) = ...; esse padrão foi removido do Haskell em 2010
-- (veja 07_codigo_do_livro). A forma atual:
fib 0 = 1
fib 1 = 1
fib n = fib (n - 1) + fib (n - 2)

-- Guardas (p. 667)
sub n
  | n < 10    = 0
  | n > 100   = 2
  | otherwise = 1

-- Polimorfismo: serve para qualquer tipo numérico (p. 668). Tipo inferido: Num a => a -> a
square x = x * x

-- Listas (p. 668). O livro chama de product; aqui, produto, porque product já existe.
produto []    = 1
produto (a:x) = a * produto x
fact2 n = produto [1 .. n]

-- Compreensões de lista (p. 668-669)
cubos = [n * n * n | n <- [1 .. 50]]
factors n = [i | i <- [1 .. n `div` 2], n `mod` i == 0]

-- Quicksort (p. 669). O livro imprimiu "b <- h" na primeira compreensão; o certo é "b <= h".
sort []    = []
sort (h:t) = sort [b | b <- t, b <= h]
             ++ [h] ++
             sort [b | b <- t, b > h]

-- Currying (p. 665-666): add recebe UM parâmetro e devolve uma função
add a b = a + b
add5 = add 5

main :: IO ()
main = do
  print (fact 5, fact2 20)           -- (120,2432902008176640000)
  print (map fib [0 .. 10])          -- [1,1,2,3,5,8,13,21,34,55,89]
  print (map sub [5, 50, 500])       -- [0,1,2]
  print (square 3, square 2.5)       -- (9,6.25)
  print (5 : [2, 7, 9])              -- [5,2,7,9]
  print [1, 3 .. 11]                 -- [1,3,5,7,9,11]
  print ([1, 3, 5] ++ [2, 4, 6])     -- [1,3,5,2,4,6]
  print (take 5 cubos)               -- [1,8,27,64,125]
  print (factors 28)                 -- [1,2,4,7,14]
  print (sort [7, 2, 9, 4, 2, 8])    -- [2,2,4,7,8,9]
  print (add5 10)                    -- 15
  print (map (add 1) [1, 2, 3])      -- [2,3,4]: avaliação parcial

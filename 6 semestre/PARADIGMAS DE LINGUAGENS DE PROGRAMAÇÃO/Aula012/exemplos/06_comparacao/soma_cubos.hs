-- Aula 12 - Soma dos cubos no estilo funcional (Sebesta 15.11, p. 678)
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)

sumCubes n = sum (map (^3) [1 .. n])                   -- a versão do livro
sumCubes2 n = sum [x ^ 3 | x <- [1 .. n]]              -- com compreensão de lista
sumCubes3 n = foldr (\x acc -> x ^ 3 + acc) 0 [1 .. n] -- com redução explícita

main :: IO ()
main = do
  print (map sumCubes [1 .. 4])      -- [1,9,36,100]
  print (sumCubes2 4, sumCubes3 4)   -- (100,100)
  print (sumCubes 1000)              -- 250500250000: Integer não estoura

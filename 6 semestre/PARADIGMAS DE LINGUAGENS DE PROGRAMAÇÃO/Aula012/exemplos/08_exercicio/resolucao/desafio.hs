-- Aula 12 - Desafio: os exercícios 1 e 4 em Haskell
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)

main :: IO ()
main = do
  let nums = [3, 8, 5, 12, 7, 6]
  print (sum [n * n | n <- nums, even n])              -- 244
  print (sum (map (^2) (filter even nums)))            -- 244
  let leituras = [12, 7, 30, -1, 18, 25]
  print (sum (takeWhile (>= 0) leituras))              -- 49

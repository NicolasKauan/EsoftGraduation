-- Aula 12 - Avaliação preguiçosa e listas infinitas (Sebesta 15.8, p. 669-671)
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)

positives = [0 ..]                   -- p. 670 (o nome é do livro, mas a lista começa em 0)
evens     = [2, 4 ..]
squares   = [n * n | n <- [0 ..]]

-- member do livro (p. 670): só termina se o número ESTIVER na lista
member b []    = False
member b (a:x) = (a == b) || member b x

-- member2 (p. 670): para lista crescente, desiste ao passar do número
member2 n (m:x)
  | m < n     = member2 n x
  | m == n    = True
  | otherwise = False

-- Um parâmetro só é avaliado se for usado
primeiro x _ = x

-- Crivo de Eratóstenes: a lista infinita dos primos
primos = crivo [2 ..]
  where crivo (p:xs) = p : crivo [x | x <- xs, x `mod` p /= 0]

-- Fibonacci infinito, definido a partir de si mesmo
fibs = 1 : 1 : zipWith (+) fibs (tail fibs)

main :: IO ()
main = do
  print (take 5 positives)           -- [0,1,2,3,4]
  print (take 5 evens)               -- [2,4,6,8,10]
  print (takeWhile (< 50) squares)   -- [0,1,4,9,16,25,36,49]
  print (member 16 squares)          -- True
  print (member2 17 squares)         -- False
  -- print (member 17 squares)       -- NUNCA termina (tire o comentário para ver)
  print (primeiro 42 (div 1 0))      -- 42: a divisão por zero nunca é calculada
  print (take 10 primos)             -- [2,3,5,7,11,13,17,19,23,29]
  print (take 12 fibs)               -- [1,1,2,3,5,8,13,21,34,55,89,144]

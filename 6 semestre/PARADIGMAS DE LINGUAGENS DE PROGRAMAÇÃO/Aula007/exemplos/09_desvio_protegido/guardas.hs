-- Aula 07 - Guardas em Haskell, herdeiras dos comandos protegidos (Sebesta 8.5, p. 353)
-- Online: https://onecompiler.com/haskell  (cole o código inteiro)
-- Local:  runghc guardas.hs
-- Diferença: em Haskell as guardas são testadas EM ORDEM (determinístico).
maior :: Int -> Int -> Int
maior x y
  | x >= y = x
  | y >= x = y

sinal :: Int -> String
sinal n
  | n < 0 = "negativo"
  | n == 0 = "zero"
  | otherwise = "positivo"

main :: IO ()
main = do
  print (maior 3 7)
  mapM_ (putStrLn . sinal) [-2, 0, 5]

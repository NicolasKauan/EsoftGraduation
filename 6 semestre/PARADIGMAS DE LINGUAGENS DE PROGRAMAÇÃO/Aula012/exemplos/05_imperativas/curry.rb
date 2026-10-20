# Aula 12 - Blocos, lambdas e currying em Ruby (Sebesta 15.10, p. 676-677)
# Online: https://onecompiler.com/ruby  (cole o código inteiro)

times = lambda { |a, b| a * b }       # p. 676-677
x = times.(3, 4)
puts x                                # 12

times5 = times.curry.(5)              # currying (p. 677)
x5 = times5.(3)
puts x5                               # 15

# Blocos: subprogramas passados a métodos (select, map, sum)
soma = [1, 2, 3, 4, 5, 6].select { |n| n.even? }.map { |n| n * n }.sum
puts soma                             # 56

# lazy: uma faixa infinita processada sob demanda
quadrados = (1..Float::INFINITY).lazy.map { |n| n * n }.first(5)
p quadrados                           # [1, 4, 9, 16, 25]

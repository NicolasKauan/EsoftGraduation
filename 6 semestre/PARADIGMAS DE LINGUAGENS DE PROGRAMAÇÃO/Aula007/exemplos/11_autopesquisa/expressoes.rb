# Autopesquisa - Expressões em Ruby: operadores são métodos (Sebesta 7.2.1.4, p. 305)
# e blocos/iteradores (Sebesta 8.3.4, p. 349-352)
# Online: https://onecompiler.com/ruby  (cole o código inteiro)
# Local:  ruby expressoes.rb
puts 1 + 2            # 3
puts 1.+(2)           # 3: o + é uma chamada de método do objeto 1
puts 2 ** 3 ** 2      # 512: ** associa à direita
3.times { |i| print i, " " }         # iterador com bloco: 0 1 2
puts
[10, 20, 30].each_with_index { |v, i| puts "#{i}: #{v}" }
puts (1..5).select(&:even?).inspect  # [2, 4]

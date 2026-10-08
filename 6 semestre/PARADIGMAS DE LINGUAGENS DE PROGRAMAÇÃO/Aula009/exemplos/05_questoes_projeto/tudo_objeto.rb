# Aula 09 - Exclusividade de objetos: em Ruby tudo é objeto (Sebesta 12.3.1, p. 493; 12.4.6, p. 522)
# Online: https://onecompiler.com/ruby  (cole o código inteiro)
# Local:  ruby tudo_objeto.rb
puts 5.class                  # Integer
puts 5.+(3)                   # 8: o + é uma mensagem enviada ao objeto 5
puts 3.14.round               # 3
puts nil.class                # NilClass
puts 5.respond_to?(:times)    # true
5.times { |i| print i }       # 01234
puts
puts [3, 1, 2].sort.reverse.inspect   # [3, 2, 1]

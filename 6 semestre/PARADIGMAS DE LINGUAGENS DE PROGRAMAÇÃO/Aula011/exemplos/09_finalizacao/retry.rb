# Aula 11 - Ruby: begin/rescue/else/ensure e retry (Sebesta 14.4.2, p. 615-616)
# Online: https://onecompiler.com/ruby  (cole o código inteiro)
# Local:  ruby retry.rb
tentativas = 0
begin
  tentativas += 1
  puts "tentativa #{tentativas}"
  raise IOError, "servidor ocupado" if tentativas < 3
  puts "conectado!"
rescue IOError => e
  puts "erro: #{e.message}"
  retry                        # REEXECUTA o bloco begin: uma forma limitada de retomada
else
  puts "else: a última tentativa não teve erro"
ensure
  puts "ensure: executa uma vez, na saída do bloco"
end

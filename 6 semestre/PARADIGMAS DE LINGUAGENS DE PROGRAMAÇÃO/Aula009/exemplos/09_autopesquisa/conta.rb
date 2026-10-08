# Autopesquisa - Tipos de dados abstratos em Ruby (Sebesta 11.4.5, p. 466-470)
# Online: https://onecompiler.com/ruby  (cole o código inteiro)
# Local:  ruby conta.rb
class Conta
  attr_reader :titular          # gera o método de leitura "titular"

  def initialize(titular)
    @titular = titular          # variáveis de instância (@) são sempre privadas
    @saldo = 0
  end

  def depositar(valor)
    @saldo += valor
    self
  end

  def to_s
    "#{@titular}: #{@saldo}"
  end
end

c = Conta.new("Ana")
c.depositar(50).depositar(25)
puts c                          # Ana: 75
puts c.titular                  # Ana
begin
  c.saldo
rescue NoMethodError => e
  puts "erro: #{e.class}"       # erro: NoMethodError
end

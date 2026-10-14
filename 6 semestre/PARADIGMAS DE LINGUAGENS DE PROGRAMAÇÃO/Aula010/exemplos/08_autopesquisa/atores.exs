# Autopesquisa - Concorrência em linguagens funcionais: o modelo de atores (Sebesta 13.9, p. 583-586)
# Online: https://onecompiler.com/elixir  (cole o código inteiro)
# Local:  elixir atores.exs
defmodule Contador do
  def loop(total) do
    receive do
      {:somar, n} -> loop(total + n)                     # o estado vive na recursão
      {:valor, quem} -> send(quem, {:total, total}); loop(total)
    end
  end
end

pid = spawn(fn -> Contador.loop(0) end)                  # cria um processo leve (um ator)
Enum.each(1..100, fn i -> send(pid, {:somar, i}) end)    # 100 mensagens
send(pid, {:valor, self()})

receive do
  {:total, t} -> IO.puts("total = #{t}")                 # total = 5050: sem locks, só mensagens
end

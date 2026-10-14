-- Autopesquisa - Tarefas e rendezvous em Ada (Sebesta 13.6, p. 560-568)
-- Online: https://onecompiler.com/ada  (cole o código inteiro; o procedimento se chama Main)
with Ada.Text_IO; use Ada.Text_IO;

procedure Main is
   task Buffer is                            -- tarefa servidora que guarda o buffer
      entry Depositar (X : in Integer);
      entry Retirar (X : out Integer);
   end Buffer;

   task body Buffer is
      Tam   : constant := 3;
      Dados : array (1 .. Tam) of Integer;
      Qtd   : Natural := 0;
      Entra : Positive := 1;
      Sai   : Positive := 1;
   begin
      loop
         select
            when Qtd < Tam =>                 -- guarda: comando protegido (Cap. 8)
               accept Depositar (X : in Integer) do
                  Dados (Entra) := X;
               end Depositar;
               Entra := Entra mod Tam + 1;
               Qtd := Qtd + 1;
         or
            when Qtd > 0 =>
               accept Retirar (X : out Integer) do
                  X := Dados (Sai);
               end Retirar;
               Sai := Sai mod Tam + 1;
               Qtd := Qtd - 1;
         or
            terminate;                        -- termina quando ninguém mais puder chamar
         end select;
      end loop;
   end Buffer;

   task Produtor;
   task body Produtor is
   begin
      for I in 1 .. 5 loop
         Buffer.Depositar (I * 10);           -- rendezvous com a tarefa Buffer
      end loop;
   end Produtor;

   Valor : Integer;
   Soma  : Integer := 0;
begin
   for I in 1 .. 5 loop
      Buffer.Retirar (Valor);
      Soma := Soma + Valor;
   end loop;
   Put_Line ("Soma =" & Integer'Image (Soma));   -- Soma = 150
end Main;

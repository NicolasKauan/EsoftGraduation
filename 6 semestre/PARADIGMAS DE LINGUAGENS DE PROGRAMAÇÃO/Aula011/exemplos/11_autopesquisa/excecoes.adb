-- Autopesquisa - Tratamento de exceções em Ada (plano de ensino; o Sebesta 11ª ed. retirou a seção)
-- Online: https://onecompiler.com/ada  (cole o código inteiro; o procedimento se chama Main)
with Ada.Text_IO; use Ada.Text_IO;

procedure Main is
   Saldo_Insuficiente : exception;                 -- exceção definida pelo usuário

   procedure Sacar (Saldo : in out Integer; Valor : Integer) is
   begin
      if Valor > Saldo then
         raise Saldo_Insuficiente;                  -- levantar explicitamente
      end if;
      Saldo := Saldo - Valor;
   end Sacar;

   type Nota is range 0 .. 10;
   V : array (1 .. 3) of Integer := (1, 2, 3);
   I : Integer := 4;
   S : Integer := 100;
begin
   declare
      N : Nota;
      Valor : Integer := 11;
   begin
      N := Nota (Valor);                            -- fora da faixa: exceção PREDEFINIDA
      Put_Line (Nota'Image (N));
   exception
      when Constraint_Error =>
         Put_Line ("Constraint_Error: 11 não é uma Nota");
   end;

   begin
      Put_Line (Integer'Image (V (I)));             -- índice fora da faixa: também Constraint_Error
   exception
      when Constraint_Error =>
         Put_Line ("Constraint_Error: índice 4 fora de 1 .. 3");
   end;

   begin
      Sacar (S, 500);
   exception
      when Saldo_Insuficiente =>
         Put_Line ("Saldo_Insuficiente: o saldo continua" & Integer'Image (S));
   end;
end Main;

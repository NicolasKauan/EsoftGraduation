// Aula 06 - Ponteiros em Go: sem aritmética e com coleta de lixo (Sebesta 6.11, p. 273-285)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run ponteiros.go
package main

import "fmt"

type Pessoa struct {
	Nome  string
	Idade int
}

func criar() *int {
	local := 42
	return &local // seguro em Go: a análise de escape move 'local' para o monte
}

func aniversario(p *Pessoa) {
	p.Idade++ // p.Idade é açúcar sintático para (*p).Idade
}

func main() {
	x := criar()
	fmt.Println(*x)

	ana := Pessoa{"Ana", 20}
	aniversario(&ana)
	fmt.Println(ana) // {Ana 21}

	// x++            // ERRO de compilação: Go não tem aritmética de ponteiros

	var ninguem *Pessoa
	fmt.Println(ninguem == nil) // true
	fmt.Println(ninguem.Nome)   // panic: invalid memory address or nil pointer dereference
}

// Aula 09 - O TAD pilha em Go: visibilidade por pacote (Sebesta 11.2-11.4)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run pilha.go
package main

import (
	"errors"
	"fmt"
)

// Em Go, a visibilidade é por PACOTE: nomes com inicial MAIÚSCULA são exportados.
// Pilha é exportada; o campo dados (minúsculo) só é visível dentro do pacote.
type Pilha struct {
	dados []int
}

func (p *Pilha) Empilhar(x int) { p.dados = append(p.dados, x) }

func (p *Pilha) Desempilhar() (int, error) {
	if p.Vazia() {
		return 0, errors.New("pilha vazia")
	}
	x := p.dados[len(p.dados)-1]
	p.dados = p.dados[:len(p.dados)-1]
	return x, nil
}

func (p *Pilha) Topo() int   { return p.dados[len(p.dados)-1] }
func (p *Pilha) Vazia() bool { return len(p.dados) == 0 }

func main() {
	var p Pilha // o "valor zero" já é uma pilha vazia válida: não precisa de construtor
	p.Empilhar(42)
	p.Empilhar(29)
	fmt.Println("29 is:", p.Topo())
	p.Desempilhar()
	fmt.Println("42 is:", p.Topo())
	_, err := (&Pilha{}).Desempilhar()
	fmt.Println("erro:", err)
	// Aqui (mesmo pacote) p.dados é acessível; em outro pacote seria erro de compilação.
}

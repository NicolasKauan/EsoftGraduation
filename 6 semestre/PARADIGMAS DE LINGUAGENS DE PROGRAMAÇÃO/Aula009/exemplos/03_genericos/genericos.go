// Aula 09 - Genéricos em Go (1.18+) com restrições (Sebesta 11.5, p. 470-474)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run genericos.go
package main

import "fmt"

type Pilha[T any] struct {
	dados []T
}

func (p *Pilha[T]) Empilhar(x T) { p.dados = append(p.dados, x) }

func (p *Pilha[T]) Desempilhar() T {
	x := p.dados[len(p.dados)-1]
	p.dados = p.dados[:len(p.dados)-1]
	return x
}

type Numero interface{ ~int | ~float64 } // restrição: só tipos numéricos

func Soma[T Numero](xs []T) T {
	var total T
	for _, x := range xs {
		total += x
	}
	return total
}

func main() {
	var p Pilha[string]
	p.Empilhar("Ana")
	p.Empilhar("Bia")
	fmt.Println(p.Desempilhar())            // Bia
	fmt.Println(Soma([]int{1, 2, 3}))       // 6
	fmt.Println(Soma([]float64{0.5, 0.25})) // 0.75
	// fmt.Println(Soma([]string{"a"}))     // ERRO de compilação: string não satisfaz Numero
}

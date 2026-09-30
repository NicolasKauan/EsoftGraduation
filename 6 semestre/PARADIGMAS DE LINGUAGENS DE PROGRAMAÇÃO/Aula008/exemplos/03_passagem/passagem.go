// Aula 08 - Go passa por valor; ponteiros e fatias compartilham dados (Sebesta 9.5, p. 375-391)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run passagem.go
package main

import "fmt"

type Ponto struct{ X, Y int }

func moveCopia(p Ponto)     { p.X = 100 } // struct por VALOR: altera a cópia
func movePonteiro(p *Ponto) { p.X = 100 } // ponteiro: altera o original

func main() {
	p := Ponto{1, 2}
	moveCopia(p)
	fmt.Println(p) // {1 2}
	movePonteiro(&p)
	fmt.Println(p) // {100 2}
}

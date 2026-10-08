// Aula 09 - OO sem herança de classes em Go: interfaces implícitas e composição
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run interfaces.go
package main

import (
	"fmt"
	"math"
)

type Forma interface { // interface: só o protocolo
	Area() float64
}

type Circulo struct{ R float64 }
type Retangulo struct{ L, A float64 }

// Não há "implements": quem tem o método Area() satisfaz Forma (interface implícita)
func (c Circulo) Area() float64   { return math.Pi * c.R * c.R }
func (r Retangulo) Area() float64 { return r.L * r.A }

type Nomeado struct{ Nome string }

func (n Nomeado) Saudacao() string { return "Olá, " + n.Nome }

type Funcionario struct {
	Nomeado // "embedding": composição que promove os métodos de Nomeado
	Cargo   string
}

func main() {
	formas := []Forma{Circulo{1}, Retangulo{2, 3}}
	for _, f := range formas {
		fmt.Printf("%T: %.2f\n", f, f.Area()) // vinculação dinâmica pela interface
	}
	f := Funcionario{Nomeado{"Ana"}, "dev"}
	fmt.Println(f.Saudacao(), "-", f.Cargo) // método obtido por composição
}

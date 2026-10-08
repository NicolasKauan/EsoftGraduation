// Exercício Aula 09 - Questão 6: qual é a saída? Por quê?
// Online: https://onecompiler.com/go  (cole o código inteiro)
package main

import "fmt"

type Animal struct{}

func (Animal) Som() string     { return "..." }
func (a Animal) Falar() string { return "faz " + a.Som() }

type Cao struct{ Animal }

func (Cao) Som() string { return "au" }

func main() {
	fmt.Println(Cao{}.Falar(), Cao{}.Som())
}

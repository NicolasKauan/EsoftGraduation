// Aula 08 - Fechamentos em Go (Sebesta 9.12, p. 404-406)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run fechamentos.go
package main

import "fmt"

func criarContador() func() int {
	n := 0
	return func() int { // captura n: o compilador move n para o monte
		n++
		return n
	}
}

func main() {
	c1 := criarContador()
	c2 := criarContador()
	c1()
	c1()
	fmt.Println(c1(), c2()) // 3 1: cada fechamento tem o seu próprio n
}

// Exercício Aula 07 - Questão 5: qual é a saída? Onde está o bug?
// Online: https://onecompiler.com/go  (cole o código inteiro)
package main

import "fmt"

func main() {
	x := 10
	if x > 5 {
		x := x * 2
		fmt.Println("dentro:", x)
	}
	fmt.Println("fora:", x)
}

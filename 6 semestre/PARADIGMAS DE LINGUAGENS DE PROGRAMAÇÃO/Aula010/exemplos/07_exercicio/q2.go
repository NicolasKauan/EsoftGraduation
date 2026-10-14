// Exercício Aula 10 - Questão 2: o que é impresso? Há algum problema?
// Online: https://onecompiler.com/go  (cole o código inteiro)
package main

import "fmt"

func main() {
	for i := 0; i < 3; i++ {
		go fmt.Println("goroutine", i)
	}
	fmt.Println("fim do main")
}

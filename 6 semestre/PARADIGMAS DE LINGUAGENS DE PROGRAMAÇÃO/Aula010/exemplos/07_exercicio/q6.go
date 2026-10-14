// Exercício Aula 10 - Questão 6: o que acontece?
// Online: https://onecompiler.com/go  (cole o código inteiro)
package main

import "fmt"

func main() {
	ch := make(chan int)
	ch <- 1
	fmt.Println(<-ch)
}

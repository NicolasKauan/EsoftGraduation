// Aula 11 - Finalização em Go: defer (Sebesta 14.1.2, p. 600-601)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run finalizacao.go
package main

import "fmt"

func main() {
	for i := 1; i <= 3; i++ {
		defer fmt.Println("defer", i) // executados na ordem INVERSA, ao sair da função
	}
	fmt.Println("corpo da função")
}

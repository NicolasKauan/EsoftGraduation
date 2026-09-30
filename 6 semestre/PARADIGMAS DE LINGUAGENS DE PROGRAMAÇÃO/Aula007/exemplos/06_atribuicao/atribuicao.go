// Aula 07 - Atribuição em Go (Sebesta 7.7, p. 317-321)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run atribuicao.go
package main

import "fmt"

func main() {
	a, b := 1, 2 // declaração curta com múltiplos alvos
	a, b = b, a  // troca
	fmt.Println(a, b) // 2 1

	x := 10
	x++ // em Go, x++ é uma SENTENÇA, não uma expressão
	// y := x++         // ERRO de compilação
	// if x = 5 { }     // ERRO de compilação: atribuição não é expressão
	if y := x * 2; y > 15 { // sentença de inicialização dentro do if
		fmt.Println("y =", y)
	}
	fmt.Println("x =", x)
}

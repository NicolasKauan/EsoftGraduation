// Aula 07 - Ordem de avaliação dos operandos e efeitos colaterais (Sebesta 7.2.2, p. 307-308)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run ordem.go
package main

import "fmt"

var a = 5

func fun1() int {
	a = 17 // efeito colateral
	return 3
}

func main() {
	// A especificação de Go define a ordem das CHAMADAS de função, mas não diz
	// se a variável 'a' é lida antes ou depois de fun1(): o resultado não é garantido.
	a = a + fun1()
	fmt.Println("a =", a) // o compilador atual dá 20 (Java daria 8)
}

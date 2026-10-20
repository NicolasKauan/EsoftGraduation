// Exercício Aula 11 - Questão 3: o que é impresso?
// Online: https://onecompiler.com/go  (cole o código inteiro)
package main

import (
	"fmt"
	"strconv"
)

func main() {
	n, _ := strconv.Atoi("12a")
	fmt.Println(n * 2)
}

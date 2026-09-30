// Autopesquisa - Matrizes associativas (Sebesta 6.6, p. 259-263)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run associativas.go
package main

import "fmt"

func main() {
	idades := map[string]int{"ana": 20, "bia": 22}
	idades["caio"] = 19

	v, ok := idades["zeca"] // idioma "vírgula ok": distingue "ausente" de "vale zero"
	fmt.Println(v, ok)      // 0 false

	delete(idades, "bia")
	for nome, idade := range idades { // a ordem de iteração é propositalmente aleatória
		fmt.Println(nome, idade)
	}
}

// Aula 11 - Mesmo cenário: converter um texto e dividir 100 por ele (Go: erros como valores)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run dividir.go
package main

import (
	"errors"
	"fmt"
	"strconv"
)

var ErrDivisaoPorZero = errors.New("divisão por zero")

func dividirCem(texto string) (int, error) {
	n, err := strconv.Atoi(texto)
	if err != nil {
		return 0, fmt.Errorf("não é um número: %w", err)
	}
	if n == 0 {
		return 0, ErrDivisaoPorZero // sem este teste, 100 / 0 com inteiros daria PANIC
	}
	return 100 / n, nil
}

func main() {
	for _, entrada := range []string{"4", "0", "abc"} {
		r, err := dividirCem(entrada)
		if err != nil {
			fmt.Println(entrada, "->", err)
			continue
		}
		fmt.Println(entrada, "->", r)
	}
}

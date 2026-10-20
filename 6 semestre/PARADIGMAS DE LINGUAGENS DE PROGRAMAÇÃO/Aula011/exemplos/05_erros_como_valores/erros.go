// Aula 11 - Go: erros como valores, defer, panic e recover
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run erros.go
package main

import (
	"errors"
	"fmt"
	"os"
)

var ErrSaldo = errors.New("saldo insuficiente") // erro "sentinela"

func sacar(saldo, valor float64) (float64, error) {
	if valor > saldo {
		return saldo, fmt.Errorf("sacar %.2f: %w", valor, ErrSaldo) // embrulha o erro
	}
	return saldo - valor, nil
}

func processar() (err error) {
	defer fmt.Println("defer: executa na saída, como um finally")
	defer func() {
		if r := recover(); r != nil { // recover: captura um panic
			err = fmt.Errorf("recuperado de: %v", r)
		}
	}()
	var m map[string]int
	m["x"] = 1 // panic: escrita em mapa nil
	return nil
}

func main() {
	s, err := sacar(100, 250)
	if err != nil { // o erro é um VALOR comum, verificado com if
		fmt.Println("erro:", err, "| é ErrSaldo?", errors.Is(err, ErrSaldo))
	}
	fmt.Println("saldo:", s)

	_, err = os.Open("nao_existe.txt")
	fmt.Println("erro:", err)

	fmt.Println(processar())
}

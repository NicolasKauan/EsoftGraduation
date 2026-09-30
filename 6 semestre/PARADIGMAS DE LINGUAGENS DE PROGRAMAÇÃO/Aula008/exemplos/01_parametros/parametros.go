// Aula 08 - Parâmetros em Go: variádicos e vários retornos (Sebesta 9.2.3 e 9.8.3, p. 367-371 e 396)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run parametros.go
package main

import "fmt"

func dividir(a, b int) (quociente, resto int) { // dois valores de retorno (p. 396)
	return a / b, a % b
}

func soma(nums ...int) int { // variádico: nums é uma fatia
	total := 0
	for _, n := range nums {
		total += n
	}
	return total
}

func main() {
	q, r := dividir(17, 5)
	fmt.Println(q, r)             // 3 2
	fmt.Println(soma(1, 2, 3, 4)) // 10
	valores := []int{10, 20}
	fmt.Println(soma(valores...)) // 30: "espalha" a fatia
	// Go não tem parâmetros padrão, de palavra-chave, nem sobrecarga
}

// Aula 06 - Matrizes e verificação de índices (Sebesta 6.5.2-6.5.3, p. 249-251)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run limites.go
package main

import "fmt"

func main() {
	arr := [3]int{10, 20, 30} // matriz: o tamanho faz parte do TIPO ([3]int)
	// fmt.Println(arr[3])    // ERRO de compilação: índice constante fora dos limites
	fmt.Println(arr, len(arr))

	v := []int{10, 20, 30} // fatia (slice): pode crescer com append
	v = append(v, 40)
	fmt.Println(v, "len =", len(v), "cap =", cap(v))

	i := 5
	fmt.Println(v[i]) // panic: runtime error: index out of range [5] with length 4
}

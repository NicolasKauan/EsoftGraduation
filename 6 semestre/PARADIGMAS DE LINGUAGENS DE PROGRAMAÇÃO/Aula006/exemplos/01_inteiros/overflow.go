// Aula 06 - Tipos de dados primitivos: inteiros (Sebesta 6.2.1.1, p. 236)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run overflow.go      (ou https://go.dev/play)
package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {
	var x int32 = math.MaxInt32
	x++ // estouro silencioso em tempo de execução
	fmt.Println("MaxInt32 + 1 =", x)

	var b uint8 = 255
	b++
	fmt.Println("uint8 255 + 1 =", b)

	// var y int32 = math.MaxInt32 + 1 // ERRO de compilação: a constante estoura int32

	fmt.Println("int nesta plataforma tem", strconv.IntSize, "bits")
}

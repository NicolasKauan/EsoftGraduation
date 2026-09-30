// Aula 07 - Conversões de tipos: Go não faz coerção (Sebesta 7.4, p. 310-313)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run conversoes.go
package main

import "fmt"

func main() {
	var i int32 = 100
	// var j int64 = i        // ERRO de compilação: nem int32 -> int64 é automático
	var j int64 = int64(i)    // conversão explícita obrigatória
	fmt.Println(j)

	// fmt.Println(i + j)     // ERRO de compilação: não existe int32 + int64

	var f float64 = 3.99
	fmt.Println(int(f))       // 3: trunca

	const k = 10              // constante sem tipo: se adapta ao contexto
	fmt.Println(k * 2.5)      // 25

	fmt.Println(byte(200 + i)) // 44: 300 não cabe em um byte (300 - 256)
}

// Aula 06 - Cadeias de caracteres (Sebesta 6.3, p. 240-244)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run cadeias.go
package main

import (
	"fmt"
	"strings"
	"unicode/utf8"
)

func main() {
	s := "ação"
	fmt.Println("len (bytes):", len(s))                          // 6
	fmt.Println("runas (caracteres):", utf8.RuneCountInString(s)) // 4
	fmt.Println("s[1] é um byte:", s[1])                          // 195

	for i, r := range s { // range percorre RUNAS (caracteres Unicode)
		fmt.Printf("índice de byte %d -> %c\n", i, r)
	}

	// s[0] = 'A' // ERRO de compilação: strings em Go são imutáveis
	t := strings.ToUpper(s) // cria uma NOVA string
	fmt.Println(s, t)

	// Para montar strings em laço, use strings.Builder
	var sb strings.Builder
	for i := 0; i < 3; i++ {
		sb.WriteString("go ")
	}
	fmt.Println(sb.String())
}

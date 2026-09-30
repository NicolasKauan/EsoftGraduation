// Aula 06 - Fatias (Sebesta 6.5.7, p. 254)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run fatias.go
package main

import "fmt"

func main() {
	a := []int{1, 2, 3, 4, 5}
	s := a[1:3] // [2 3]: NÃO copia, compartilha a matriz de 'a'
	fmt.Println("s =", s, "len =", len(s), "cap =", cap(s))

	s[0] = 99
	fmt.Println("depois de s[0] = 99  -> a =", a)

	s = append(s, 100) // ainda cabe na capacidade: sobrescreve a[3]!
	fmt.Println("depois do append     -> a =", a)

	c := make([]int, len(s))
	copy(c, s) // cópia explícita e independente
	c[0] = -1
	fmt.Println("c =", c, " s =", s)
}

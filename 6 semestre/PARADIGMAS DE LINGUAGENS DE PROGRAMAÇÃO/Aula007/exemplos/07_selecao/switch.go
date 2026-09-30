// Aula 07 - switch em Go: sem "cair" entre casos (Sebesta 8.2.2, p. 334-341)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run switch.go
package main

import "fmt"

func main() {
	for _, n := range []int{1, 2, 3, 4, 9} {
		switch n { // cada caso termina sozinho, sem break
		case 1, 3:
			fmt.Println(n, "ímpar pequeno")
		case 2:
			fmt.Println(n, "dois")
			fallthrough // "cair" no próximo caso só se for EXPLÍCITO
		case 4:
			fmt.Println(n, "par pequeno")
		default:
			fmt.Println(n, "outro")
		}
	}

	x := 42
	switch { // switch sem expressão = cadeia de if / else if (p. 339)
	case x < 0:
		fmt.Println("negativo")
	case x < 100:
		fmt.Println("menor que 100")
	default:
		fmt.Println("grande")
	}
}

// Aula 07 - Comandos protegidos em Go: o select (Sebesta 8.5, p. 353-355)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run select.go
package main

import "fmt"

func main() {
	a := make(chan string, 1)
	b := make(chan string, 1)
	contagem := map[string]int{}
	for i := 0; i < 1000; i++ {
		a <- "a"
		b <- "b"
		select { // as duas "guardas" estão prontas: Go escolhe uma ao acaso
		case x := <-a:
			contagem[x]++
			<-b // esvazia o outro canal
		case x := <-b:
			contagem[x]++
			<-a
		}
	}
	fmt.Println(contagem) // algo como map[a:497 b:503]: muda a cada execução
}

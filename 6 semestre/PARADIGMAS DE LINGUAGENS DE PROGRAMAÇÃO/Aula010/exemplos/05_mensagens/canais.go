// Aula 10 - Passagem de mensagens em Go: canais (Sebesta 13.5, p. 559-560)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run canais.go
// "Não comunique compartilhando memória; compartilhe memória comunicando."
package main

import "fmt"

func produtor(n int, saida chan<- int) {
	for i := 1; i <= n; i++ {
		saida <- i // envia; num canal sem buffer, espera o receptor (rendezvous)
	}
	close(saida)
}

func main() {
	ch := make(chan int) // canal SEM buffer: comunicação síncrona
	go produtor(5, ch)   // goroutine: tarefa leve
	soma := 0
	for v := range ch { // recebe até o canal ser fechado
		fmt.Println("recebeu", v)
		soma += v
	}
	fmt.Println("soma =", soma) // 15
}

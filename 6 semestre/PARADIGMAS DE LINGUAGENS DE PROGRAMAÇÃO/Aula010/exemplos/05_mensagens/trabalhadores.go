// Aula 10 - Grupo de trabalhadores e select com tempo limite (Sebesta 13.5 e 8.5)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run trabalhadores.go
package main

import (
	"fmt"
	"sync"
	"time"
)

func trabalhador(id int, tarefas <-chan int, resultados chan<- string, wg *sync.WaitGroup) {
	defer wg.Done()
	for t := range tarefas {
		time.Sleep(50 * time.Millisecond) // simula trabalho
		resultados <- fmt.Sprintf("trabalhador %d fez a tarefa %d", id, t)
	}
}

func main() {
	tarefas := make(chan int, 10)
	resultados := make(chan string, 10)
	var wg sync.WaitGroup
	inicio := time.Now()
	for id := 1; id <= 3; id++ {
		wg.Add(1)
		go trabalhador(id, tarefas, resultados, &wg)
	}
	for t := 1; t <= 6; t++ {
		tarefas <- t
	}
	close(tarefas)
	wg.Wait()
	close(resultados)
	for r := range resultados {
		fmt.Println(r)
	}
	fmt.Println("6 tarefas de 50 ms com 3 trabalhadores levaram ~",
		time.Since(inicio).Round(50*time.Millisecond)) // ~100ms, e não 300ms

	lento := make(chan string)
	go func() { time.Sleep(time.Second); lento <- "resposta" }()
	select { // comando protegido (aula 7) com tempo limite
	case r := <-lento:
		fmt.Println(r)
	case <-time.After(200 * time.Millisecond):
		fmt.Println("tempo esgotado: desisti de esperar")
	}
}

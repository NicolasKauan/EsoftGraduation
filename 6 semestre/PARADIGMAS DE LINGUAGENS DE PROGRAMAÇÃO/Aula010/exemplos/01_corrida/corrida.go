// Aula 10 - Condição de corrida em Go e três formas de corrigir (Sebesta 13.2.1, p. 548)
// Online: https://onecompiler.com/go  (cole o código inteiro)
// Local:  go run corrida.go      (go run -race corrida.go detecta a corrida)
package main

import (
	"fmt"
	"sync"
	"sync/atomic"
)

func main() {
	var wg sync.WaitGroup
	semSync := 0
	comMutex := 0
	var mu sync.Mutex
	var atomico atomic.Int64

	for g := 0; g < 4; g++ { // 4 goroutines
		wg.Add(1)
		go func() {
			defer wg.Done()
			for i := 0; i < 250000; i++ {
				semSync++ // condição de corrida

				mu.Lock() // exclusão mútua
				comMutex++
				mu.Unlock()

				atomico.Add(1) // operação atômica, sem bloqueio
			}
		}()
	}
	wg.Wait()
	fmt.Println("esperado:  1000000")
	fmt.Println("sem sync: ", semSync, "(muda a cada execução)")
	fmt.Println("com mutex:", comMutex)
	fmt.Println("atômico:  ", atomico.Load())
}

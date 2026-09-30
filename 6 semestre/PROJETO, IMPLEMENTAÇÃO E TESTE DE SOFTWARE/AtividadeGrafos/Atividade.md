# Exercícios — Grafo de Fluxo de Controle

## Exercício 1 — Classificação de pedido

### 1. Blocos básicos

Separei o código nos seguintes blocos:

1. Início e `desconto = 0`
2. Verifica se `valor >= 500`
3. Define `desconto = 10`
4. Verifica se o cliente é VIP
5. Soma 5 no desconto
6. Verifica se o pagamento foi aprovado
7. Retorna `"PAGAMENTO RECUSADO"`
8. Calcula o valor final
9. Retorna `"PEDIDO APROVADO"`
10. Fim

### 2. Decisões

Tem 3 decisões no código:

* `valor >= 500`
* `clienteVip`
* `!pagamentoAprovado`

Então são **3 decisões**.

### 3. Grafo de fluxo

Pode representar assim:

```text
1 → 2
    ↓ verdadeiro
    3
    ↓
    4
    ↓ verdadeiro
    5
    ↓
    6
   ↙ ↘
  7   8
      ↓
      9
      ↓
     10

2 → 4 quando for falso
4 → 6 quando for falso
7 → 10
```

### 4. Retorno antecipado

O retorno antecipado acontece quando o pagamento não foi aprovado.

Nesse caso, o programa entra no bloco 7 e já retorna:

`PAGAMENTO RECUSADO`

Ele não continua para calcular o valor final.

### 5. Número de nós e arestas

Número de nós:

**N = 10**

Número de arestas:

**E = 12**

As arestas são:

* 1 → 2
* 2 → 3
* 2 → 4
* 3 → 4
* 4 → 5
* 4 → 6
* 5 → 6
* 6 → 7
* 6 → 8
* 7 → 10
* 8 → 9
* 9 → 10

### 6. Complexidade ciclomática usando E - N + 2

V(G) = E - N + 2

V(G) = 12 - 10 + 2

**V(G) = 4**

### 7. Usando o número de decisões

Também dá para calcular assim:

V(G) = decisões + 1

V(G) = 3 + 1

**V(G) = 4**

Os dois cálculos deram o mesmo resultado.

### 8. Caminhos independentes

Alguns caminhos possíveis são:

**Caminho 1:**

```text
1 → 2(F) → 4(F) → 6(F) → 8 → 9 → 10
```

**Caminho 2:**

```text
1 → 2(V) → 3 → 4(F) → 6(F) → 8 → 9 → 10
```

**Caminho 3:**

```text
1 → 2(F) → 4(V) → 5 → 6(F) → 8 → 9 → 10
```

**Caminho 4:**

```text
1 → 2(F) → 4(F) → 6(V) → 7 → 10
```

### 9. Valores para testar

| Valor | Cliente VIP | Pagamento | Resultado              |
| ----- | ----------- | --------- | ---------------------- |
| 300   | Não         | Sim       | PEDIDO APROVADO: 300.0 |
| 500   | Não         | Sim       | PEDIDO APROVADO: 450.0 |
| 300   | Sim         | Sim       | PEDIDO APROVADO: 285.0 |
| 300   | Não         | Não       | PAGAMENTO RECUSADO     |

### 10. Discussão

Como existem 3 condições, se considerar todas as combinações possíveis, temos:

**2³ = 8 combinações.**

Isso não significa que a complexidade ciclomática seja 8. Nesse caso, a complexidade é **4**, porque existem 3 decisões no código.

O `return` do pagamento recusado faz o método parar naquele momento. Por isso, quando o pagamento não é aprovado, o cálculo de `valorFinal` não acontece.

---

# Exercício 2 — Análise de leituras de temperatura

## 1. Blocos básicos

Os blocos que identifiquei são:

1. Início, `alertas = 0` e `i = 0`
2. Verifica `i < temperaturas.length`
3. Verifica `temperaturas[i] < 0`
4. Soma 2 em `alertas`
5. Verifica `temperaturas[i] > 35`
6. Soma 1 em `alertas`
7. Incrementa `i`
8. Retorna `alertas`
9. Fim

### 2. Decisões

Existem 3 decisões:

* `i < temperaturas.length`
* `temperaturas[i] < 0`
* `temperaturas[i] > 35`

O `else if` também conta como uma nova decisão, porque existe outra condição sendo verificada.

### 3. Grafo de fluxo

Uma forma de representar o fluxo é:

```text
1 → 2
    ↓ verdadeiro
    3
   ↙ ↘
  4   5
  ↓  ↙ ↘
  7  6   7
  ↓  ↓   ↓
  └→ 7 ←─┘
      ↓
      2

2 → 8 quando for falso
8 → 9
```

O ponto principal é que depois do bloco 7 o programa volta para o `while` e verifica a condição novamente.

### 4. Entrada do loop e classificações

O `while` é responsável por controlar a entrada no loop.

Dentro dele, cada temperatura pode cair em três situações:

* Menor que 0 → soma 2 alertas.
* Maior que 35 → soma 1 alerta.
* Entre 0 e 35, incluindo os dois → não soma alerta.

Depois disso, `i` é incrementado e o programa volta para o `while`.

### 5. Número de nós e arestas

Número de nós:

**N = 9**

Número de arestas:

**E = 11**

Arestas:

* 1 → 2
* 2 → 3
* 2 → 8
* 3 → 4
* 3 → 5
* 4 → 7
* 5 → 6
* 5 → 7
* 6 → 7
* 7 → 2
* 8 → 9

### 6. Complexidade ciclomática

Usando:

V(G) = E - N + 2

V(G) = 11 - 9 + 2

**V(G) = 4**

Também pode ser calculado pelas decisões:

V(G) = decisões + 1

V(G) = 3 + 1

**V(G) = 4**

### 7. Caminhos independentes

**Caminho 1 — nenhuma repetição do while:**

```text
1 → 2(F) → 8 → 9
```

**Caminho 2 — temperatura negativa:**

```text
1 → 2(V) → 3(V) → 4 → 7 → 2(F) → 8 → 9
```

**Caminho 3 — temperatura maior que 35:**

```text
1 → 2(V) → 3(F) → 5(V) → 6 → 7 → 2(F) → 8 → 9
```

**Caminho 4 — temperatura entre 0 e 35:**

```text
1 → 2(V) → 3(F) → 5(F) → 7 → 2(F) → 8 → 9
```

### 8. Vetores de teste

**Vetor vazio:**

```text
{}
```

Nesse caso, o `while` já começa falso e nenhum alerta é contado.

**Temperatura negativa:**

```text
{-5}
```

Entra no primeiro `if` e soma 2.

**Temperatura maior que 35:**

```text
{40}
```

Entra no `else if` e soma 1.

**Temperatura entre 0 e 35:**

```text
{25}
```

Não entra em nenhum dos dois blocos e não soma alerta.

Também é interessante testar exatamente `0` e `35`, pois são os limites das condições.

### 9. Valores esperados

| Vetor  | Resultado |
| ------ | --------: |
| `{}`   |         0 |
| `{-5}` |         2 |
| `{40}` |         1 |
| `{25}` |         0 |

### 10. Retorno do loop

Depois que o programa executa o `i++`, ele volta para a condição do `while`.

Se ainda tiver alguma temperatura para analisar, o loop continua.

Quando `i < temperaturas.length` fica falso, o loop termina e o programa vai para o `return alertas`.

Por isso existe uma aresta voltando do bloco 7 para o bloco 2.

---

# Conclusão

Nos dois exercícios foram encontradas 3 decisões.

Por isso, nos dois casos a complexidade ciclomática ficou:

**V(G) = 3 + 1 = 4**

No primeiro exercício, o ponto que merece mais atenção é o `return` antecipado do pagamento recusado.

No segundo, o principal detalhe é o retorno do fluxo para o `while`, já que o código pode passar várias vezes pelos mesmos blocos enquanto ainda existirem temperaturas no vetor.

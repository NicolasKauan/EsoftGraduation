// Aula 12 - F#: pipeline, composição, currying e sequências preguiçosas (Sebesta 15.9, p. 671-674)
// Online: https://onecompiler.com/fsharp  (cole o código inteiro)

let rec factorial x =                          // p. 673
    if x <= 1 then 1 else x * factorial (x - 1)

let x4 x =                                     // p. 673: cada let cria um NOVO x
    let x = x * x
    let x = x * x
    x

// Pipeline |> (p. 674): os dados "fluem" pelas funções
let myNums = [1; 2; 3; 4; 5]
let evensTimesFive =
    myNums
    |> List.filter (fun n -> n % 2 = 0)
    |> List.map (fun n -> 5 * n)

// Composição >> (p. 674): (f >> g) x = g (f x)
let incrementa x = x + 1
let dobra x = x * 2
let incDepoisDobra = incrementa >> dobra

// Currying e avaliação parcial (p. 674)
let add a b = a + b
let add5 = add 5

// Sequências são preguiçosas e podem ser infinitas (p. 672-673)
let cubes = seq { for i in 1..5 -> (i, i * i * i) }
let naturais = Seq.initInfinite id

printfn "%d %d" (factorial 5) (x4 3)           // 120 81
printfn "%A" evensTimesFive                    // [10; 20]
printfn "%d" (incDepoisDobra 3)                // 8
printfn "%d" (add5 10)                         // 15
printfn "%A" (Seq.toList cubes)                // [(1, 1); (2, 8); (3, 27); (4, 64); (5, 125)]
printfn "%A" (naturais |> Seq.filter (fun n -> n % 7 = 0) |> Seq.take 5 |> Seq.toList)

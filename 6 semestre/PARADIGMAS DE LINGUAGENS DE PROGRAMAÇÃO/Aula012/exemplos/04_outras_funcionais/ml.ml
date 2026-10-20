(* Aula 12 - ML (aqui, OCaml): inferência de tipos, casamento de padrões e currying
   (Sebesta 15.7, p. 660-666)
   Online: https://onecompiler.com/ocaml  (cole o código inteiro)
   O livro usa Standard ML; OCaml é da mesma família, com pequenas diferenças de sintaxe.
   Em OCaml, os operadores de float têm ponto: +. -. *. /. *)

(* Inferência de tipos (p. 661-662): nenhum tipo foi declarado *)
let circumf r = 3.14159 *. r *. r     (* float -> float  (fórmula como no livro) *)
let times10 x = 10 * x                (* int -> int *)
let square x = x * x                  (* int -> int: square 2.75 seria ERRO de tipo *)

(* Casamento de padrões (p. 662-664) *)
let rec fact = function
  | 0 -> 1
  | n -> n * fact (n - 1)

let rec append l1 l2 = match l1 with
  | [] -> l2
  | h :: t -> h :: append t l2

(* Currying e avaliação parcial (p. 665-666) *)
let add a b = a + b
let add5 = add 5

let imprime lista = List.iter (Printf.printf "%d ") lista; print_newline ()

let () =
  Printf.printf "%.2f %d %d\n" (circumf 2.0) (times10 4) (square 7);   (* 12.57 40 49 *)
  Printf.printf "%d\n" (fact 10);                                        (* 3628800 *)
  imprime (append [1; 2] [3; 4]);                                        (* 1 2 3 4 *)
  (* filter e map (p. 664-665) *)
  imprime (List.filter (fun x -> x < 100) [25; 1; 50; 711; 100; 150; 27; 161; 3]);
  imprime (List.map (fun x -> x * x * x) [1; 3; 5]);                     (* 1 27 125 *)
  Printf.printf "%d\n" (add5 10);                                        (* 15 *)
  (* let ... in (p. 664): nomes locais *)
  let radius = 2.7 and pi = 3.14159 in
  Printf.printf "%.4f\n" (pi *. radius *. radius)                        (* 22.9022 *)

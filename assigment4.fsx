type Exp =
    | Num of int
    | Neg of Exp
    | Sum of Exp * Exp
    | Diff of Exp * Exp
    | Prod of Exp * Exp
    | Quot of Exp * Exp

type 'a Option =
    None | Some of 'a


let rec evaluate = function
| Num n -> Some(n)
| Neg e -> match evaluate e with
          | Some(e) -> Some(-e)
          | None -> None
| Sum (e, i) -> match evaluate e with
               | Some (e) -> match evaluate i with
                       | Some(i) -> Some(i+e)
                       | None -> evaluate i
               | None -> None 
| Diff (e, i) -> match evaluate e with
               | Some (e) -> match evaluate i with
                       | Some(i) -> Some(e-i)
                       | None -> evaluate i
               | None -> None 
| Prod (e, i) -> match evaluate e with 
                 | Some (e) -> match evaluate i with
                             | Some (i) -> Some (i * e)
                             | None -> evaluate i
                 | None -> None
| Quot (e, i) -> match evaluate e with
                 | Some (e) -> match evaluate i with
                           | Some(i) -> if i=0 then None else Some (e/i)
                           | None -> evaluate i
                 | None -> None

evaluate(Prod(Num 3, Diff(Num 5, Num 1)));;
evaluate (Diff (Num 3, Quot (Num 5, Prod (Num 7, Num 0))));;
evaluate (Quot (Num 14, Prod (Num 2, Diff (Num 8, Num 1))));;
evaluate (Sum (Num 9, Diff (Num 4, Prod (Num 2, Num 3))));;

fun f -> fun x -> f (f x);;

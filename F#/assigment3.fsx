(*
    1.
*)
 let inner v1 v2 =
    let rec sub = function
        |([], []) -> 0
        |(_, []) -> 0
        |([], _) -> 0
        | (x::xs, y::ys) -> x*y + sub(xs,ys)
    sub(v1, v2);;     

 let testcase1() = 
    let x = [1;2;3]
    let z = [4;5;6]
    let y = inner x z
    printf "innerproduct of %A and %A is %A\n"x z y;;

 testcase1();;

 let testcase2() =
    let x = [44;300;5]
    let z = [1000;30]
    let y = inner x z
    printf "innerproduct of %A and %A is %A\n"x z y;;

 testcase2();;

 let testcase3() =
    let x = []
    let z = []
    let y = inner x z
    printf "innerproduct of %A and %A is %A\n"x z y;;

 testcase3();;

(*
    2.
*)
 let rec transpose = function
    | [] -> failwith "cannot transpose a 0-by-n matrix"
    | []::xs -> [] 
    | xs -> List.map List.head xs :: transpose (List.map List.tail xs);;

let multiply (matrix1, matrix2) = 
  let matrix2_transposed = transpose matrix2

  let rec inner_multiply = function
  | ([], []) -> []
  | (_, []) -> []
  | ([], _) -> []
  | (x::xs, y::ys) -> (List.map (fun z -> inner x z) (y::ys)) :: inner_multiply (xs, y::ys)

  inner_multiply (matrix1, matrix2_transposed);;

   let testcase4() =
    let x = [[1;2;3];[4;5;6]]
    let z = [[0;1];[3;2];[1;2]]
    let y = multiply (x, z)
    printf "the product of %A and %A is %A\n"x z y;;

 testcase4();;

 let testcase5() =
    let x = []
    let z = [[60;13];[83;22];[81;562]]
    let y = multiply (x, z)
    printf "the product of %A and %A is %A\n"x z y;;

 testcase5();;


(*
    3.
*)
 let rec fold f a = function
    | []    -> a
    | x::xs -> fold f (f a x) xs;;


let rec foldBack f xs a =
      match xs with
      | []    -> a
      | y::ys -> f y (foldBack f ys a);;

let flatten1 xs = List.fold (@) [] xs

let flatten2 xs = List.foldBack (@) xs []

(*
 Asymptotic time compexity comparison 
 When using the functions on a list of lenght n fold and foldback will have the same complexity for each operation O(1)
 Hence the complexity of both will be O(n). 
 However the complexity change in the @ function used in flatten1 and flatten2
 The complexit of @ is O(n) where n is the lenght of the first list passed.
 In this case, Complexity of flatten1 will be O(m*n*(n-1)) where m is the length of each element in xs (in this case 1)
 On the other hand, complexity of flatten2 will be O(n*m) or in this case just O(n) because m=1
 It is clear that flatten2 will be more efficient and we can see the experimental results bellow.  
*)


let lst = [ for i in 1..1000 -> [[i]] ]
#time "on";;

let x = flatten1 lst;;

let y = flatten2 lst;;
#time "off";;

printfn "we can see with the #time function that flatten2 takes no time to complete (00:00:00.000) while flatten1 takes slightly more (00:00:00:011), we can conclude that flatten2 is the more efficient ";;
    
(*
    4.
*)
let twice f = (fun x -> f (f x));;

let twice2 f = f << f;;

let successor n = n+1;;

let testcase6()=
    printfn "twice successor 0 = %A" (twice successor 0)
    printfn "(twice(twice successor)) 0 = %A" ((twice(twice successor)) 0)
    printfn "(twice(twice(twice successor))) 0 = %A" ((twice(twice(twice successor))) 0)
    printfn "(twice (twice (twice (twice successor)))) 0 = %A" ((twice (twice (twice (twice successor)))) 0)
    printfn "calculates 2^k where k = the amount of time twice is called so 2^1 = 2, 2^2 = 4, 2^3 = 8, 2^4 = 16 ..."
    printfn " "
    printfn "twice successor 0 = %A" (twice successor 0)
    printfn "twice twice successor 0 = %A" (twice twice successor 0)
    printfn "twice twice twice successor 0 = %A" (twice twice twice successor 0)
    printfn "twice twice twice twice successor 0 = %A" (twice twice twice twice successor 0)
    printfn "calculates 2^k where k = previous number calculated so 2^1 = 2, 2^2 = 4, 2^4 = 16, 2^16 = 65536 etc..";;

testcase6();;
(*
 twice successor 0;;                                returns 2^1 = 2   
(twice(twice successor)) 0;;                        returns 2^2 = 4
(twice(twice(twice successor))) 0;;                 returns 2^3 = 8
(twice (twice (twice (twice successor)))) 0;;       returns 2^4 = 16

calculates 2^k where k = the amount of time twice is called so 1, 2, 3, 4 ...

twice successor 0;;                                 returns 2^1 = 2
twice twice successor 0;                            returns 2^2 = 4
twice twice twice successor 0;;                     returns 2^4 = 16
twice twice twice twice successor 0;;               returns 2^16 = 65536

calculates 2^k where k = previous number calculated so 2, 4, 16, 65536 etc..
*)



(*
    5.
*)

//stream definition
type 'a stream = Cons of 'a * (unit -> 'a stream)

//infinte list of natural from numbers from n
let rec upfrom n = Cons (n, fun() -> upfrom (n+1));;

let nums = upfrom 0;;

let rec take n (Cons(x,xsf)) =
   match n with
   | 0 -> []
   | _ -> x :: take (n-1)(xsf());;


let rec filter p (Cons (x, xsf)) =
    if p x then Cons (x, fun() -> filter p (xsf()))
    else filter p (xsf());;

// power function to find exponents
let rec power x = function
 |n -> if n = 1 then x
       else x * power x (n-1);;

// takes a number and adds all it's digits
let rec cubesum = function
| 0 -> 0
| x -> power (x % 10) 3 + cubesum (x / 10);;

//declares an infite stream of armstrong numbers
let rec armstrong (Cons (x, xsf)) = 
  Cons (x, fun() -> armstrong (filter (fun n -> (n = cubesum n)) (xsf())));;


 let result = armstrong nums;; 


 let testcase7() =
    let x = take 1 result
    printfn "the first armstrong number is %A" x;;

testcase7();;

 let testcase8() =
    let x = take 2 result
    printfn "the first two armstrong numbers are %A" x;;

testcase8();;

 let testcase9() =
    let x = take 3 result
    printfn "the first three armstrong numbers are %A" x;;

testcase9();;

 let testcase10() =
    let x = take 4 result
    printfn "the first four armstrong numbers are %A" x;;

testcase10();;

 let testcase11() =
    let x = take 5 result
    printfn "the first five armstrong number are %A" x;;

testcase11();;
// #1
let rec cartesian xs = fun ys -> match xs, ys with
|[], _ -> []
|_, [] -> []
|[x], y::ys -> (x, y) :: cartesian [x] ys
|x::xs, ys -> cartesian [x] ys @ cartesian xs ys;;

let testcase1 () =
    let z = ["a"; "b"; "c"]
    let w = [1;2]
    let f = cartesian z w
    printf "the cartesean product of %A and %A = %A" z w f;;

testcase1();;

List.map;;




//#2
let rec powerset = 
   function
   | [] -> [[]]
   | (x::xs) -> List.map (fun y -> x::y) (powerset xs) @ powerset xs;;

let testcase3 () = 
    let w = ["cat";"dog";"rat"]
    let x = powerset w
    printf "the powerset of %A is %A" w x;;

testcase3 ();;


//#3
let rec transpose = function
| [] -> failwith "cannot transpose matrix"
| []::xs -> [] 
| xs -> List.map List.head xs :: transpose (List.map List.tail xs);;

let testcase4 () =
    let y = [[1;2;3];[4;5;6]]
    let x = transpose y
    printf "the transpose of %A = %A" y x;;

testcase4();;


//#4
let rec sort = function
  | []         -> []
  | [x]        -> [x]
  | x1::x2::xs -> if x1 <= x2 then x1 :: sort (x2::xs)
                              else x2 :: sort (x1::xs);;

(*fails to completely irretate through the whole list, it only checks the two elements but only for the list once. its the first bubble sort comparison method call
    Criteria #1: The base case returns the correct answer.
    the base case retuns empty list if empty list or returns a list with 1 element if only one element is in list.

    Criteria #2: Non-base cases returns the correct answer, assuming recursion works.
    assuming recursion works, then we can verify that the correct answer will be returned. in this case the comparison does work and it returns the appropriate result

    Criteria #3: Make sure that each recursive call is on a smaller input.
    when we call the next recursion it uses the tail therefore shrinking the list in theory, however, the result is not completely correct since it only recurses on 
    the list once which is the result we are given [1; 3; 1; 4; 5; 2; 6; 5; 9]. here we need to continue to call the sort method size of the list times (in this case 9 times total) 

*)


//#5
let rec merge = function// Merges two sorted lists
| ([], ys)       -> ys
| (xs, [])       -> xs
| (x::xs, y::ys) -> if x < y then x :: merge (xs, y::ys)
                            else y :: merge (x::xs, ys)
let rec split = function
| []       -> ([], [])
| [a]      -> ([a], [])
| a::b::cs -> let (M,N) = split cs
                   (a::M, b::N)

let rec mergesort = function
| []  -> []
| [x] -> [x]
| L   -> let (M, N) = split L
         merge (mergesort M, mergesort N);;

let testcase5() =
    let x = [5;2;99;37;500]
    let y = mergesort x
    printf "%A sorted is %A" x y;;

testcase5();;

let testcase6() =
    let x = ["rat";"cat";"bird";"dog"]
    let y = mergesort x
    printf "%A sorted is %A" x y;;

testcase6();;

(*
   a. Criteria #1: The base case returns the correct answer.
    The base cases return to the correct input. If a list is of size zero 
    (e.g, an empty list) or of size 1, then it is already sorted.

    Criteria #2: Non-base cases returns the correct answer, assuming recursion works.
	 The non-base case is incorrect as it only compares the first two elements of
    the list against each other. For example, say the input list was [3;5;1;2;4].
    The fist iteration of the non-base case will result in 5::sort(3::[1;2;4]), 
    which makes 4 the first element of the returning list, even if we assume
    the recursive call is correct. The non-base case only compares the first two 
    elements to each other and not the rest of the list.
    Therefore, 
        x1 :: sort (x2::xs)
        x2 :: sort (x1::xs)
    both fail to return correct results.

	Criteria #3: Make sure that each recursive call is on a smaller input.
    All recursive calls are smaller, since the recursive calls are made using 
    x1::xs and x2::xs, which are smaller than x1::x2::xs.

   b. val merge : 'a list * 'a list -> 'a list when 'a : comparison
    val split : _arg1:'a list -> 'a list * 'a list
    val mergesort : _arg1:'a list -> 'b list when 'b : comparison

    it's because mergesort has type  'a list -> 'b list and thats the bug. it should be 'a list -> 'a list because its the same type of input you're only re arranging the contents inside of it. ex [1;3;2;4] should return [1;2;3;4] and both have the same type 


    when ran this is the error: FS0030: Value restriction. The value 'it' has been inferred to have generic type
        val it : '_a list when '_a : comparison    
    Either define 'it' as a simple data term, make it a function with explicit arguments or, if you do not intend for it to be generic, add a type annotation.

        c.

    let rec mergesort = function
    | []  -> []
    | [x] -> [x]
    | L   -> let (M, N) = split L
             merge (mergesort M, mergesort N)

    this is where the bug is just add the test case when [x] -> [x]

*)


//#6
(*

TYPES:
    val curry : f:('a * 'b -> 'c) -> a:'a -> b:'b -> 'c

    val uncurry : f:('a -> 'b -> 'c) -> a:'a * b:'b -> 'c
*)
let curry f a b = f(a, b);;

let uncurry f (a, b) = f a b;; 

let testcase7 () =
    let plus = uncurry (+)
    let z = plus (2,3)
    let cplus = curry plus
    let plus3 = cplus 3
    let w = plus3 10
    printfn "plus = %A" plus
    printfn "plus (2,3) = %A" z
    printfn "curry plus is %A" cplus
    printfn "cplus 3 is %A" plus3
    printfn "plus3 10 is %A" w;;

testcase7();;




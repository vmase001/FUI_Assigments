
let rec gcd x y =
    match x, y with
    | (x,0) -> x
    | (x,y) -> gcd y (x%y);;

let testcase1 () =
    let x = (6,48)
    let y = gcd 6 48
    printfn " The gcd of %A is %A" x y;;

testcase1 ();;

let (.+) (a,b) (c,d) = 
    let x = (a*d)+(b*c)
    let y = (b*d)
    let z  = gcd x y
    (x/z,y/z);;
    
let testcase2 () = 
    let x = (1,2)
    let y = (3,4) 
    let (a,b) = x .+ y
    printfn "%A (.+) %A = (%A,%A)" x y a b;;

testcase2();;

let (.*)(a, b)(c, d) =
    let x = (a*c)
    let y = (b*d)
    let z = gcd x y
    (x/z,y/z);;

let testcase3 () = 
    let x = (1,2)
    let y = (16,25)
    let (a,b) = x .* y
    printfn "%A (.*) %A = (%A,%A)" x y a b;;

testcase3 ();;


let testcase4 () =
    let x = (1,2)
    let y = (2,3) 
    let z = (3,4)
    let (a,b) = x .+ y.*z 
    printfn "%A (.+) %A (.*) %A = (%A,%A)" x y z a b ;;

testcase4 ();;

// Function to reverse a list of lists
let revlists xs = List.map (fun x -> List.rev x) xs;;

let testcase5 () =
    let l1 = [[1..10];[35;36;37;38];[2;1];[]]
    let x =revlists l1
    printfn "The reverse of %A is %A" l1 x;;

testcase5 ();;

// Function to interleave two lists
let rec interleave xs ys =
    match xs, ys with
    | [], ys -> ys
    | xs, [] -> xs
    | x::xs, y::ys -> x::y::interleave xs ys

let testcase6 () = 
    let l1 = [3..5]
    let l2 = [1..10]
    let l3 =interleave l1 l2
    printfn "The interleave of %A and %A is %A" l1 l2 l3;;

testcase6();;


let gencut (n, list) = 
    let rec aux = function
    | 0, xs, ys -> (List.rev xs,ys) //must return xs reversed since you are adding the head of ys to the beginning of the list each time.
    | n, xs, [] -> (xs, [])| n, xs, ys -> aux(n-1, List.head ys :: xs, List.tail ys)
    aux (n, [], list);;


let testcase7 () =
    let l1 = [1;3;4;2;7;0;9]
    let n = 2
    let l2 =gencut(n, l1)
    printfn "gencut of %A with size %A is %A" l1 n l2;;


testcase7();;


let cut list = 
    let n = (List.length list)/2 
    gencut(n,list);;


let testcase8() = 
    let list = [1..6] 
    let clist = cut list
    printfn "%A cut in half is %A" list clist;;


testcase8();;


let shuffle list =
    let (x,y) = cut list
    interleave x y


let testcase9 () = 
    let l1 = [1..8]
    let sl = shuffle l1
    printfn " %A shuffled is %A" l1 sl;;


testcase9();;



let countaux (deck, target) = 
    let rec aux = function
    | (n, deck, target) when deck = target -> n // check if the two lists are equal 
    | (n, deck, target) when deck <> target -> aux( n+1, shuffle deck, target) // if not equal then reshuffle and increment n
    aux (1, deck, target);; // must start n at one since you pass a shuffled deck already

// Counts how many times a deck of size n needs to be shuffled to get back to original deck.
let countshuffles n = 
    let deck = [1..n]
    let target = deck
    countaux(shuffle deck,target);;


let testcase10 () = 
    let m = 52
    let n = countshuffles 52
    printfn "countshuffle %A is %A" m n;;

testcase10 ();;


type point = {x : float; y: float; z: float};;

let mypoint = {x = 1.0; y = 1.0; z = -1.0};;

type Car = {
    Make : string
    Model : string
    mutable Odometer : int
    }
let myCar = { Make = "Fabrikam"; Model = "Coupe"; Odometer = 108112 }
myCar.Odometer <- myCar.Odometer + 21

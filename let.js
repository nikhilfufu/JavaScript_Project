// let wa started from ES6 
// let has scope only for block and can be updated but cant be re declared again like var 
// i.e 

let a = "nikhil"
{
    let a = "this from block"
    console.log(a)
     let b
    console.log(b)
}
console.log(a)


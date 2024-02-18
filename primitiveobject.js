// there are 7 types of data types 
//Number
//Null
//symbol
//string 
//undefined
//boolean
//bigint

let a ="string"
let b = null
let c = undefined
let g = BigInt("5000000000")
let h = Symbol("this is symbol")
let d = 300
let f = true
console.log(a,b,c,d,f,g,h)

//objects in js
// object is not but key value pair good practise is when key shld be written inside double quotes  
let man ={
    "nameee":"nikhil",
    "cllg":"vemana",
    "usn":"ivi19ec094",
    "finaldetails":function(){
        return this.nameee+" "+this.cllg+" "+this.usn
    }
}
var s =man.weight
console.log(man["nameee"])
console.log(man.finaldetails())
//eval() used to evaluate the expression
let da = 49
let fg = 56
let gs = eval("da+fg")
console.log(gs)
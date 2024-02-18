//diff between let var const
//
var a = "nikhil"
{
    var a= "jeethu"
}
console.log(a)
let x = "nikhil"
{
let x = "jeethu"
}
console.log(x)
//types of datatupes
null
Number
Boolean
BigInt
String 
Symbol
undefined

// how to create object
//it will be in the form of key value pair

let obj = {
    "name":"nikhil",
    "age":23,
    "colour":"brown"

}
console.log(obj)
obj["bike"]="r15"
console.log(obj)

//how to create a new method or function

function methodName(x) {
    console.log("this was the number given:"+x);
   
}
 methodName(6);
// `this was the number ${x}`
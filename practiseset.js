//create a variable of type string and try to add a number to it

var String = "nikhil"
var n = String + 2
console.log(n)
console.log(typeof n)


// create a object of const type yes we can change the value and key and even add a new key and value but we cant store or redeclare the variable cause the variable has the reference of that obj and we cant create a new obj for that .
const obj ={
    name:"nikhil",
    age:20
}
obj['india']="yes"
obj['india']="no"
console.log(obj)


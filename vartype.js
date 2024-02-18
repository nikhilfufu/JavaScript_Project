// var is old and can be used but it can reinitalized and can access out of the scope also 
//var is used till ES5

//i.e

var a = "hello"
{
    var a ="nikhil"
    console.log(a)// nikhil
}
console.log(a)//nikhil

// this is the reason why we will not use var
let age = 30//prompt("what is ur age?")//prompt only works in browser and replit
if(age >=10 && age<20){
    console.log("the age is")
}
else{
    console.log("over agee!!!")
}
let x= 'a'.charCodeAt()
console.log(x)

//switch

let x2 = 20
let x3 = Number.parseInt(x2)
switch (x3) {
    case 20:
        console.log("hello")
        break
    case 3:
        console.log("yessir")

    default:
        console.log("wrong number")
        break;
}

let num = "nikhil"
let num2 = Number.parseInt(num)
console.log(num2)
if(num2%2==0 && num2%3==0){
    console.log("number is  divisble by 3 and 2")
}
else{
    console.log("it is not divisble by 3 and 2")
}

let yes = (20>18?"he can drive":"he can not ")
console.log(yes)

let l = [2,3,4,5]
function findminmax(arr){
    let x = Math.min(...arr)
    let y = Math.max(...arr)
return [x,y]
}
console.log(findminmax(l))

// Example: Rest in function parameters
function displayNames(first, last, ...restOfNames) {
    console.log(`First name: ${first}`);
    console.log(`Last name: ${last}`);
    console.log(`Other names: ${restOfNames.join(',')}`);
}

displayNames('John', 'Doe', 'Jane', 'Smith', 'Jim', 'Brown');


let arra = [1,2,3,4,5]

function restandspread(first,second){
    console.log(`furst number: ${first}`)
    console.log(`furst number: ${second}`)

}
restandspread(1,2,3)
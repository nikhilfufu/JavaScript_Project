//Types of for loops
//for loop
//for in loop
//for of loop

//for in loop is used iterarte keys of an object

let obj={
    nikhil:40,
    ved:50,
    priyanka:60,
    jo:90,
    mohith:100

}
for (let a in obj){
    console.log(`the keys are ${a} there marks are ${obj[a]}`)
}

//for of loop used to itrate
for(let a of "harry"){
    console.log(a)
}
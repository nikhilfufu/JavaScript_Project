//java script is object oriented multi paragim programing lang.
//oops stored in the form of object
// multi-paradigm we can use differnt styles of programing i.e imparative and declarative.



//html is like content
//css is used for presentation
//js used for actions

//js is used for dynamic effects and web applications in the browser 

// es = ECMA Sript

 function opt(x1){
    let c = Number.parseInt(x1)
    let otp =""
    for(let x = 0;x<c;x++){
        otp+=Math.floor(Math.random()*10)
    }
    return otp
}
let x1 = opt(5)
console.log(x1)

let x = ()=>{
    const z = 5
    let c = ""
    for(let x = 0;x<z;x++){
        c+=Math.floor(Math.random()*10)
    }
    return c
}
console.log(x())
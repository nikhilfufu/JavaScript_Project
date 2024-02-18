let x ={
    "name":"nikhil",
    "dob":"24-09-2001",
    "usn":"1vi19eco94"
}
console.log(x.usn)



Object.defineProperty(x,"usn",{
    writable:false
})
x.usn ="123"
let y = x.usn
console.log(y)
console.log("the vakuse of usn is "+x.usn)

function otp(a){
    let x =""
    for(i=0;i<a;i++){
        x+=Math.floor(Math.random()*10)
    }
    console.log(x)
}
otp(4)

console.log(Math.random())
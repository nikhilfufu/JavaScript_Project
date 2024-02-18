let x = "hello world"
for (let iterator of x) {
    if(/[aeiou]/i.test(iterator)){
        console.log(`${iterator} is vowel `)
    }
    else{
        console.log(`${iterator} is not vowel `)
    }
}
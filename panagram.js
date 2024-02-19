let s = "The quick brown fox jumps over the lazy dog"
let v = s.replace(/\s/g,"").toLowerCase()
console.log(v)
let s2 = new Set(v)
console.log(s2.size)
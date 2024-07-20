// Referencia

let a = {prop: 1}

let b = a

b.prop = 1
console.log(a,b)

function suma(n) {
    n.prop++
}

suma(a)
console.log(a)
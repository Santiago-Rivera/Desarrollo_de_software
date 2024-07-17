// Short circuit

// Falso: false, 0, ¨, null, underfined, NaN

[] || {} 

console.log([] || {})

console.log([] && {})

let nombre = "felipe"
let usuario = nombre || "Desconocido"
console.log(usuario)

function fnp() {
    console.log("Soy funcion principal")
    return false
}

function fn1() {
    console.log("Soy funcion 1")
    return true
}

let x = fnp() && fn1()

//Ciclos: Son loops 

//Ejemplos de ciclos

/*console.log("1 x 1")
console.log("1 x 2")
console.log("1 x 3")
console.log("1 x 4")
console.log("1 x 5")
console.log("1 x 6")
console.log("1 x 7")
console.log("1 x 8")
console.log("1 x 9")
console.log("1 x 10")
console.log("1 x 11")
console.log("1 x 12")*/

//Como se debe hacer un ciclo de verdad

//Ciclo for
for (let tabla = 1; tabla <= 12; tabla++) {
    for (let num = 1; num <= 12; num++) {
        const resultado = tabla + " x " + num + " = " + tabla*num
        console.log(resultado)
    }
}

for (let num = 0; num < 10; num++) {
    if (num % 2 == 0) {
        console.log(num)
    } else {
        console.log("impar")
    }
}

//Ciclo while
let edad = 0

while(edad < 18){
    console.log("eres un niño")
        edad++
}
console.log("YA ERES UN ADULTO")

//Ejercicios de ajedres
for (let lin = 1; lin < 9; lin++){
    let linea = ""
        for (let casilla = 0; casilla < 8; casilla++) {
    if (casilla % 2 == 0 && lin % 2 == 0){
        linea = linea + "*"
    } 
    if (casilla % 2 == 0 && lin % 2 != 0){
        linea = linea + "o"
    } 
    if (casilla % 2 != 0 && lin % 2 == 0){
        linea = linea + "o"
    } 
    if (casilla % 2 != 0 && lin % 2 != 0){
        linea = linea + "*"
    } 
} 
console.log(linea)
}
// Concepto de funcion: Es un bloque de codigo que realiza una actividad especifica y se puede reutilizar.
// Estructura de una funcion: Nombre, parametros y valores de retorno

let cadena = "hola, mundo, JavaScript"
split = cadena.split(",")
console.log(split)

let caden = "Hola"
substring = caden.substring(0,3)
console.log(substring)

let numbers = [2, 4, 8, 16]
let halves = numbers.map(function(x) {return x / 2;})
console.log(halves)

// Ejercicio 1

let num = [2, 4, 6, 8, 10]
mayor = Math.max(...num)
console.log("El mayor de los numeros " + "es " + Math.max(...num))

// Ejercicio 2 

let numeros = [2, 4, 6, 8, 10]
menor = Math.min(...num)
console.log("El menor de los numeros " + "es " + Math.min(...numeros))

// Ejercicio 3

let numero = [2, 4, 6, 8, 10]
mayor = Math.max(...numero)
menor = Math.min(...numero)
console.log("El mayor de los numeros " + "es " + Math.max(...numero))
console.log("y el numero menor " + "es " + Math.min(...numero))

// Ejercicio 4 

let saldo = 1000

function consignar(valor) {
    if (valor < 10) {
        return false
    }
    saldo += valor
    return true
}

function retirar(valor) {
    if (valor > saldo) {
        return false 
    }
    saldo -= valor
    return true
}

function realizarAccion(accion) {
    if (accion === "1") {
        let valor = parseInt(prompt("Digite el valor a consuignar:"))
        return consignar(valor)
    }

    if (accion === "2") {
        let valor = parseInt(prompt("Digite el valor a retirar:"))
        return retirar(valor)
    }

    return false 
}

function main() {
    while (true){
        let accion = parseInt(prompt("¿Qué opcion desea? 1. Consignar, 2. Retirar , 3. Salir"))
        if (accion === "3") {
            alert("Hasta luego")
            break
        }

        let resultado = realizarAccion(accion)
        if (resultado === false) {
            alert("Esta accion no se pudo realizar")
        } else {
            alert("Accion realizada, nuevo saldo" + saldo)
        }
}
}
main()
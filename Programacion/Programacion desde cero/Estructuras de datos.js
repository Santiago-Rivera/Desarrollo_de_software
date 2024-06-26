//Estructuras de datos

let cancion = "los pollitos dicen"
console.log(cancion)

cancion = "17 años"
console.log(cancion)

//Listas

let lista = ["los pollitos", "17 años", "Hasta la madre"]
let cantidad = lista.length
console.log(cantidad)
console.log(lista[1])
console.log(lista[lista.length-1])

let list = []
console.log(list)

list.push("Hasta la madre")
list.push("it's my life")
list.push("saturday")
list.push("the outside")
console.log(list)

list[1] = "it's my life"
console.log(list[1])

let listo = ["Santiago", 23, true, []]
console.log(listo)

for (let i = 0; i < list.length; i++) {
    console.log(list[i])
}

let i = 0

while (i < list.length) {
    console.log(list[i])
        i++
}

list.forEach(cancion => console.log(cancion))

list.map(cancion => console.log(cancion))
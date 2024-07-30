//Bucles

// Bucle while

let i = 2

while (i < 10) {
    console.log(i)
    i++
}

console.log("Fuera del while")

// Bucle do while 

do {
    if (i % 2 == 0){
        console.log("Numero par", i)
        }
        i++
} while(i < 10)

// Bucle for 

let o = 2

while (o < 2) {
    if (o % 2 == 0) {
        console.log("Numero par", o)
    }
    o++
} 


for (o = 2; o < 2; o++) {
    if (o % 2 == 0) {
        console.log("Numero par", o)
    }
}

// Bucle for of 

let animales = ["Murcielago", "Halcon", "Elefante"]

for (let animal of animales) {
    console.log(animal)
}

// Bucle for in

let user = {
    id: 1,
    name: "Santiago",
    age: 19,
}

for (let prop in user) {
    console.log(prop, user[prop])
}

// break - continue

let r = 0
while (r < 7) {
    r++
    if (r === 3) {
        continue
    }
    if (r === 4) {
        break
    }
    console.log(r)
}

// Bucle Switch

let accion = "Listar"

switch (accion) {
    case "actualizar":
        console.log("Accion de listar")
        break
    case "guardar":
        console.log("Accion de guardar")
        break
    default:
        console.log("Accion desconocida")
}
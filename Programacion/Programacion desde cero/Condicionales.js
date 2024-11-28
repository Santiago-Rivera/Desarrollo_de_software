/* Condicionales: Son estructoras de control
condicionales simples */
let condicion = true

if (condicion){
    // lo que pasa si es verdadero
        console.log("verdadero")
} else {
    // lo que pasa si es falso
        console.log(falso)
}

// Condicionales multiples
if (5 > 3 && 3 > 4){
    // lo que pasa si es verdadero
        console.log("1")
} else if (10 == 5){
    // lo que pasa si es falso
        console.log("2")
} else if (3 < 2){
    console.log("3")
} else {
    console.log("4")
}

// Switch
let descuento = 0
let pais = "Argentina"

if(pais == "Peru") {
    descuento = 10
} else if (pais == "Argentina") {
    descuento = 10
} else if (pais == "Bolivia") {
    descuento = 20
} 

    switch (pais){
        case "Argentina":
            descuento = 10
            break
    }
console.log(descuento)
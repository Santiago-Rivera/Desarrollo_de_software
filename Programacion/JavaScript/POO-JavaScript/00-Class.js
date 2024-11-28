// Clases

class Persona {
    // Atributos

    nombre = "Daniel" 
    apellido = "Osorio"
    dreccion = "La joya"
    telefono = "0982324567"
    email = "danielosorio@gmail.com"

    // Metodos

    trabajar() {
        return "Trabaja en una empresa"
    }
    estudiar() {
        return "la escuela liceo gregoriano"
    }
}

const Daniel = new Persona()
const Isabel = new Persona()
console.log(Daniel.nombre + " " + Daniel.apellido + " " + Daniel.dreccion)
console.log(Daniel.trabajar())
console.log("Isabel", Isabel.apellido)
console.log("Estudia en:", Isabel.estudiar())

// Clase Date

// Clase fecha

const fechaActual = new Date()

console.log(fechaActual)

let fecha = new Date()
console.log("Hoy es:", fecha.getDate())
console.log("El mes es:", fecha.getMonth()+1)
console.log("El año es:", fecha.getFullYear())
console.log("La hora es:", fecha.getHours(), ":" , fecha.getMinutes(),  ":" , fecha.getSeconds())
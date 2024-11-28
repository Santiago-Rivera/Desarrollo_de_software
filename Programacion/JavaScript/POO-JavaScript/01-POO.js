// Abstraccion

function Animal(nombre, edad){
    this.nombre = nombre
    this.edad = edad
}

//Obtener el nombre

Animal.prototype.getNombre = function() {
    return this.nombre
}

// Identificar el nombre de mi animal

Animal.prototype.setNombre = function (nuevoNombre) {
    this.nombre = nuevoNombre
}

// Metodos

Animal.prototype.comer = function() {
    console.log(this.nombre, "esta comiendo")
} 

const animal = new Animal("Sabrina", 23)

console.log(animal.getNombre())
animal.setNombre("Santiago")
animal.comer()

// Herencia

function Perro(nombre, edad, raza) {
    Animal.call(this, nombre, edad)
    this.raza = raza
}

// Establecer la herencia prototipica

Perro.prototype = Object.create(Animal.prototype) 

Perro.prototype.constructor = Perro()
const silvy = new Perro("Silvy", 12 , "Dalmata")

silvy.getNombre()
silvy.comer()

// Metodos

Perro.prototype.ladrar = function () {
    console.log(this.nombre, "esta ladrando")
}

silvy.ladrar()
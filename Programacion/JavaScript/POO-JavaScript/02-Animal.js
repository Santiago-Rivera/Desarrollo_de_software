// Animal

class Animal {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    getNombre(){
        return this.nombre;
    }
    
    setNombre(nuevoNombre){
        this.nombre = nuevoNombre
    }
    
    comer(){
        console.log(this.nombre, "esta comiendo")
    }
}

const animal = new Animal("Steve", 23)
console.log(animal.getNombre())
animal.setNombre("Animal")
console.log(animal.getNombre())
animal.comer()

class Perro extends Animal {
    constructor(nombre, edad, raza) {
        super(nombre, edad)
        this.raza = raza
    }

    ladrar() {
        console.log(this.nombre, "esta ladrando")
    }
}

const nony = new Perro("Nony", 3, "Chandero")
nony.ladrar()
// Funciones

function User(name) {
    this.name = name
}

console.log(User.name)
console.log(User.length)

const U = User
let user = new U("Santiago")

console.log("User")

function of(Funciones, arg){
    return new Funciones(arg)
}

let usuario = of(User, "Santiago")
console.log(usuario)

function returned(){
    return function(){
        console.log("Hola papa")
    }
}

let saludo = returned()
saludo()
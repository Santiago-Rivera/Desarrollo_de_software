// Dinamico

const user = { id: 2}

user.name = "Santiago"
user.guardar = function () {
    console.log("Guardando", user.name)
}

user.guardar()

delete user.name
delete user.guardar
console.log(user)

const user1 = Object.freeze({id: 1})
user1.name = "Luis"
console.log(user1)
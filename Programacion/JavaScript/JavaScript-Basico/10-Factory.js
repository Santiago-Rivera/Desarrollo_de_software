// Funciones fractoria

function crearUsuario(name, email) {
    return {
        email,
        name,
        activo: true,
        recuperarClave: function () {
            console.log("Recuperando clave...")
        }
    }
}

let user1 = crearUsuario("Santiago", "riverariverakikesantiago@gmail.com")
let user2 = crearUsuario("Juan", "gomesjuan@gmail.com")
console.log(user1, user2)
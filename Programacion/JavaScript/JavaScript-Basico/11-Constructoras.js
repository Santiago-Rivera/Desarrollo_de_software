// Funciones constructoras

function Usuario() {
    this.id = 1
    this.recuperearClave = function () {
        console.log("recuperendo clave...")
    }
}

let usuario = new Usuario ()

console.log(usuario)
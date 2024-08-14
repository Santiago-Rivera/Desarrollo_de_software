// Function

function Coma(x,y) {
    this.x = x
    this.y = y
    this.dibujar = function () {console.log("Dibujando...")}
}

const Point = new Function("x", "y", `
    this.x = x
    this.y = y
    this.dibujar = function () {console.log("Dibujando...")}`)

const p = new Point (3, 4)
console.log(p)

let coma = {z: 9}
Coma.call(coma, 3, 5)
Coma.apply(coma, [5, 6])

console.log(coma)
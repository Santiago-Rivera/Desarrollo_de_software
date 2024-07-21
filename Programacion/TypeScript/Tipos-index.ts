// Tipos de datos

// Tipo String

let mensaje: string = "Hola Mundo"

mensaje = "lobito feliz"
console.log(mensaje)

// Tipo numerico

let extincioDinosaurios: number = 76_000_000

// Tipo Booleano

let estintos: boolean = true

// Tipo any

let mivariable
mivariable = "lobito feliz"
mivariable = 232

// Tipo funcion

function lobitoFeliz(config: any) {
    return config
}

// Tipo array

let animales: string[] = ["lobito", "feliz", "juan"]
let num: number[] = [1, 2, 3]
let check: boolean[] = []
let numsd: Array<number> = []

// Tipo tupla

let tupla: [number, string[]] = [1, ["lobito feliz", " hipopotamo feliz"]]

// Tipo enums

const chica = "s"
const mediana = "m"
const grande = "l"
const extragrande = "xl"

enum Talla {Chica = "s", Mediana = "m", Grande = "l", ExtraGrande = "xl"}

const variable = Talla.Grande
console.log(variable)

const enum LoadingState {Idle, Loading, Success, Error}

const estado = LoadingState.Success

// Tipo Objetos

type Direccion = {
    numero: number,
    calle: string,
    pais: string,
}

type Persona = {
    readonly id: number,
    nombre: string,
    talla: Talla,
    direccion: Direccion
}

const objeto: Persona = {
    id: 1,
    nombre: " hola mundo",
    talla: Talla.Mediana,
    direccion: {
        numero: 2,
        calle: "suelvio",
        pais: "Wembley"
    }
}
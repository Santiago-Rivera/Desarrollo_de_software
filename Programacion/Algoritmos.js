/* Conceptos de algoritmos

Algoritmos: Es una secuencia de pasos

Caracteristicas de los algoritmos: Debe ser preciso, legible, finito, general y eficiente

Partes de un algoritmos: entrada, proceso y salida*/

/* Como resolver un problema o necesidad: Tener el enunciado del problema o necesidad claro, conciso y completo

Analizar los datos que se van a procesar: Datos de entrada, de salida, formulas que procesarán los datos y los datos de prueba

Identificar las varias soluciones posibles */

// Pseudocodigo: Se escribe a mano y a partir de ese pseudocodigo se comienza a trabajar en el codigo

let year = 2032
if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
    console.log("El año " + year + " es bisiesto.")
} else {
    console.log("El año " + year + " no es bisiesto.")
}

let a = 10
console.log(a)

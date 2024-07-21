// Tipos de datos
// Tipo String
var mensaje = "Hola Mundo";
mensaje = "lobito feliz";
console.log(mensaje);
// Tipo numerico
var extincioDinosaurios = 76000000;
// Tipo Booleano
var estintos = true;
// Tipo any
var mivariable;
mivariable = "lobito feliz";
mivariable = 232;
// Tipo funcion
function lobitoFeliz(config) {
    return config;
}
// Tipo array
var animales = ["lobito", "feliz", "juan"];
var num = [1, 2, 3];
var check = [];
var numsd = [];
// Tipo tupla
var tupla = [1, ["lobito feliz", " hipopotamo feliz"]];
// Tipo enums
var chica = "s";
var mediana = "m";
var grande = "l";
var extragrande = "xl";
var Talla;
(function (Talla) {
    Talla["Chica"] = "s";
    Talla["Mediana"] = "m";
    Talla["Grande"] = "l";
    Talla["ExtraGrande"] = "xl";
})(Talla || (Talla = {}));
var variable = Talla.Grande;
console.log(variable);
var estado = 2 /* LoadingState.Success */;

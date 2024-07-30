package Examen;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario(23, "Christian", "Christianchancay@gmail.com", "Christian098977", "Juan Montalvo");

        usuario.agregarElcorreoElectronico();

        Producto producto = new Producto(133, "Camisa tipo polo", "75% hecho de algodon y 25% de poliester", 8, 20);

        producto.calcularelpreciodelproducto();

        producto.ingresarelnombredelproducto();

        Carritodecompras carritodecompras = new Carritodecompras(2331, "Camisa tipo polo, short azul y sandalias", 25, 15, "domicilio", 21.25, "Transferencia");

        carritodecompras.getMetodoDePagoE();

        carritodecompras.getMetodoDePagoE();

        Categoria categoria = new Categoria(1, "Ropa");

        categoria.ingresarelnombredelacategoria();

        Comentario comentario = new Comentario(123, "Camiseta tipo polo", "Christian", "Una excelente compra", new Date(0));

        comentario.agregarelnombredelproducto();

        comentario.ingresarlafecha();
    }
}
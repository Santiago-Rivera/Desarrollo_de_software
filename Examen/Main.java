package Examen;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario(23, "Christian", "Christianchancay@gmail.com", "Christian098977", "Juan Montalvo");

        System.out.println(usuario.agregarElcorreoElectronico());

        System.out.println(usuario.Productos());

        System.out.println(usuario.resenaDelProducto());

        Producto producto = new Producto(133, "Camisa tipo: polo", "75% hecho de algodon y 25% de poliester", 8, 20, 1, "Ropa");

        System.out.println(producto.calcularelpreciodelproducto());

        System.out.println(producto.ingresarelnombredelproducto());

        System.out.println( producto.Productos());

        System.out.println(producto.resenaDelProducto());

        Carritodecompras carritodecompras = new Carritodecompras(2331, "Camisa tipo polo, short azul y sandalias", 25, 15, "domicilio", 21.25, "Transferencia", 1, "Ropa");

        System.out.println(carritodecompras.getMetodoDePagoE());

        Categoria categoria = new Categoria(1, "Ropa");

        categoria.ingresarelnombredelacategoria();

        Comentario comentario = new Comentario(123, "Camiseta tipo polo", "Christian", "Una excelente compra", new Date());

        System.out.println(comentario.agregarelnombredelproducto());

        System.out.println(comentario.ingresarlafecha());
    }
}
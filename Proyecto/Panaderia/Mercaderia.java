package Proyecto.Panaderia;

import java.util.List;

public interface Mercaderia {

    List<String> hacerInventario();

    void entregarMercaderia();

    List<String> seleccionarRuta();
}

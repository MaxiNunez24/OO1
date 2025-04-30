import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private boolean estaPagado;
    private Bag<Producto> productos;
    private Bag<Promocion> promociones;

    public Pedido(boolean estaPagado, Bag<Producto> productos, List<Promocion> promociones) {
        this.estaPagado = estaPagado;
        this.productos = productos;
    }


}

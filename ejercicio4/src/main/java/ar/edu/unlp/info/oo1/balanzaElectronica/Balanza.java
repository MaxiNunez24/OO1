package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private List<Producto> productos;

    public Balanza() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void ponerEnCero(){
        productos.clear();
    }

    public double getPesoTotal() {
        double total = 0;
        for(Producto producto: productos){
            total += producto.getPeso();
        }
        return total;
    }

    public double getPrecioTotal() {
        double total = 0;
        for(Producto producto: productos){
            total += producto.getPrecio();
        }
        return total;
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public Ticket emitirTicket(){
        return new Ticket(getCantidadDeProductos(),getPrecioTotal(),getPesoTotal());
    }
}

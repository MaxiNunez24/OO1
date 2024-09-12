package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public Balanza() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void agregarProducto(Producto producto) {
        this.cantidadDeProductos++;
        pesoTotal += producto.getPeso();
        precioTotal += producto.getPrecioPorKilo()*producto.getPeso();
    }

    public void ponerEnCero(){
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public Ticket emitirTicket(){
        return new Ticket(getCantidadDeProductos(),getPrecioTotal(),getPesoTotal());
    }
}

package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    public Item(String unDetalle, int unaCantidad, double unCostoUnitario) {
        this.detalle = unDetalle;
        this.cantidad = unaCantidad;
        this.costoUnitario = unCostoUnitario;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double costo(){
        return getCostoUnitario()*getCantidad();
    }

}

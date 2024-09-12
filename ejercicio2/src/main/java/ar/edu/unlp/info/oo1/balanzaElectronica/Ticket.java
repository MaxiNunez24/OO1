package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;


    public Ticket(int unaCantidadDeProductos, double unPrecioTotal, double unPesoTotal){
        fecha = LocalDate.now();
        cantidadDeProductos = unaCantidadDeProductos;
        pesoTotal = unPesoTotal;
        precioTotal = unPrecioTotal;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double impuesto(){
        return getPrecioTotal()*0.21;
    }

}

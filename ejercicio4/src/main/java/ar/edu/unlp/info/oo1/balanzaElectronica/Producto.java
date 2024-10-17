package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto() {
        this.peso = 0;
        this.precioPorKilo = 0;
        this.descripcion = "Sin descripción";
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public double getPrecio() {
        return getPrecioPorKilo()*getPeso();
    }
    public void setPrecioPorKilo(double precio) {
        this.precioPorKilo = precio;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

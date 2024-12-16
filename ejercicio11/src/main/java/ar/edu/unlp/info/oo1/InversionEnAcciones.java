package ar.edu.unlp.info.oo1;

public class InversionEnAcciones implements Inversion {
    private String nombre;
    private int cantidad;
    private Double valorUnitario;

    public InversionEnAcciones(String nombre, int cantidad, Double valorUnitario){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public double calcularValor(){
        return this.cantidad * this.valorUnitario;
    }

}

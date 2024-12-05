package ar.edu.unlp.info.oo1;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(){
        super();
        this.descubierto = 0;
    }

    public double getDescubierto(){
        return this.descubierto;
    }

    public void setDescubierto(double limite){
        this.descubierto = limite;
    }

    public boolean puedeExtraer(double monto){
        return this.getDescubierto() >= Math.abs(this.getSaldo() - monto);
    }
}
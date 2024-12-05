package ar.edu.unlp.info.oo1;

public class CajaDeAhorro extends Cuenta{
    public boolean puedeExtraer(double monto){
        return this.getSaldo() >= monto * 1.02; // Se cobra un 2% de comisión
    }
}

package ar.edu.unlp.info.oo1;

public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto;

    public CuentaCorriente(){
        super();
        this.limiteDescubierto = 0;
    }

    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }

    public void setLimiteDescubierto(double limite){
        this.limiteDescubierto = limite;
    }

    public boolean puedeExtraer(double monto){
        if(this.getSaldo() >= monto){
            return true;
        }
        if(this.getLimiteDescubierto()<=0){
            return false;
        }
        this.setLimiteDescubierto(this.getLimiteDescubierto() - this.getSaldo() - monto);
        return this.getLimiteDescubierto() >= monto;
    }
}

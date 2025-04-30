public class Bebida extends Producto {
    private boolean estaCaliente;

    public Bebida(String nombre, double costo, boolean esRetirado, boolean estaCaliente){
        super(nombre, costo, esRetirado);
        this.estaCaliente = estaCaliente;
    }

    public boolean estaCaliente(){
        return estaCaliente;
    }
}

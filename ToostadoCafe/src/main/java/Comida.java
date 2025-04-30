public class Comida extends Producto {
    private boolean aptaParaVeganos;
    private boolean aptaParaCeliacos;

    public Comida(String nombre, double costo, boolean esRetirado, boolean aptaParaVeganos, boolean aptaParaCeliacos) {
        super(nombre, costo, esRetirado);
        this.aptaParaVeganos = aptaParaVeganos;
        this.aptaParaCeliacos = aptaParaCeliacos;
    }

}

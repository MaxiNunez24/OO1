public abstract class Producto {
    private double costo;
    private String nombre;
    private boolean esRetirado;

    public Producto(String nombre, double costo, boolean esRetirado){
        this.nombre = nombre;
        this.costo = costo;
        this.esRetirado = esRetirado;
    }

    public double getCosto(){
        return costo;
    }
    public  void setCosto(double costo){
        this.costo = costo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean esRetirado(){
        return esRetirado;
    }

    public void setEsRetirado(boolean esRetirado){
        this.esRetirado = esRetirado;
    }

}

package ar.edu.unlp.info.oo1;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor(String nombre) {
        this.nombre = nombre;
        this.inversiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarInversion(Inversion inversion) {
        this.inversiones.add(inversion);
    }

    public void quitarInversion(Inversion inversion) {
        this.inversiones.remove(inversion);
    }

    public double valorActual(){
       return  inversiones.stream().mapToDouble(Inversion::calcularValor).sum();
    }


}

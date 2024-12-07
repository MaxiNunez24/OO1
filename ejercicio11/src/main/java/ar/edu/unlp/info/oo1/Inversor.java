package ar.edu.unlp.info.oo1;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor() {
        this.nombre = "Sin nombre";
        this.inversiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

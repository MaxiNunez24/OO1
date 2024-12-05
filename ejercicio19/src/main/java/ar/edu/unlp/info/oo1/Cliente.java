package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public Cliente(String unNombre, String unaDireccion){
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        envios = new ArrayList<Envio>();
    }

    public double totalAPagar(LocalDate fechaInicio, LocalDate fechaFin){
        double total = 0;

        return total;
    }

    public abstract double obtenerDescuento();

    public void agregarEnvio(Envio envio){
        if (!envios.contains(envio)) envios.add(envio);
    }


}

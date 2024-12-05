package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> listaItems;

    public Presupuesto(String unCliente) {
        this.fecha = LocalDate.now();
        this.cliente = unCliente;
        this.listaItems = new ArrayList<Item>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarItem(Item item){
        listaItems.add(item);
    }

    public double calcularTotal(){
        double aux = 0;
        for(Item i : listaItems){
            aux += i.costo();
        }
        return aux;
    }

}

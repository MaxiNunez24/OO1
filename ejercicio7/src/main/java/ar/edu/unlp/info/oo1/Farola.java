package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean estado;
    private List<Farola> vecinos;

    public Farola(){
        this.estado = false;
        this.vecinos = new ArrayList<Farola>();
    }

    public List<Farola> getNeighbors (){
        return this.vecinos;
    }

    public void pairWithNeighbor (Farola otraFarola){
        if(!this.vecinos.contains(otraFarola)){
            vecinos.add(otraFarola);
            otraFarola.pairWithNeighbor(this);
        }
    }

    public boolean isOn(){
        return this.estado;
    }

    public boolean isOff(){
        return !this.estado;
    }

    public void turnOn(){
        if(this.isOff()){
            this.estado = true;
            vecinos.forEach(vecina -> vecina.turnOn());
        }
    }

    public void turnOff(){
        if(this.isOn()){
            this.estado = false;
            vecinos.forEach(vecina -> vecina.turnOff());
        }
    }


}

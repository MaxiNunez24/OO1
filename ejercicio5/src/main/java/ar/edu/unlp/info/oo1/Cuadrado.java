package ar.edu.unlp.info.oo1;

import java.io.Serializable;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado() {
        this.lado = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro(){
        return lado*4;
    }

    public double getArea(){
        return lado*lado;
    }
    


}

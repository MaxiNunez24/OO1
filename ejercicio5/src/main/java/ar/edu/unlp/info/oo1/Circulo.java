package ar.edu.unlp.info.oo1;

public class Circulo implements Figura {
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro(){
        return 2 * radio;
    }

    public void setDiametro(double diametro){
        this.radio = diametro/2;
    }

    public double getPerimetro(){
        return Math.PI * getDiametro();
    }

    public double getArea(){
        return Math.PI*radio*radio;
    }
}

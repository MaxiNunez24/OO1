package ar.edu.unlp.info.oo1;

public class Cuerpo3D {
    private Cuadrado altura;
    private Figura caraBasal;

    public Cuerpo3D(){
        this.altura = new Cuadrado();
        this.caraBasal = new Circulo();
    }

    public void setAltura(double valor){
        this.altura.setLado(valor);
    }

    public double getAltura(){
        return this.altura.getLado();
    }

    public void setCaraBasal(Figura cara){
        this.caraBasal=cara;
    }

    public double getVolumen(){
        return this.caraBasal.getArea() * this.altura.getLado();
    }

    public double getSuperficieExterior(){
        return 2*this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura.getLado();
    }
}

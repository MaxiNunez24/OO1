public class Orco extends Personaje{

    public Orco(String nombre, Rol rol){
        super(nombre, rol, 1,2);
    }


    public boolean puedeSubir(){
        return this.getNivel() % 3 == 0;
    }

    public double poderDeAtaque(int hora){
        return hora >= 20 && hora <=8 ? 1.60 : 1;
    }


}

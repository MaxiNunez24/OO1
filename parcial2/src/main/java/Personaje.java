import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int inteligencia;
    private int fuerza;
    private Rol rol;


    public Personaje(String nombre, Rol rol, int inteligencia, int fuerza) {
        this.nombre = nombre;
        this.nivel = 1;
        this.rol = rol;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
    }

    public abstract double poderDeAtaque(int hora);

    public double calcularPoderDeAtaque(int hora) {
        return rol.calcularValorBase(this) * this.poderDeAtaque(hora);
    }

    public int getNivel(){
        return nivel;
    }

    public int getInteligencia(){
        return inteligencia;
    }

    public abstract boolean puedeSubir();

    public void subirNivel(){
        this.nivel++;
        if(this.puedeSubir()){
            rol.incrementarHabilidades(this);
        }
    }
    public void subirInteligencia(double valor){
        this.inteligencia += valor;
    }

    public boolean esSimilar(Personaje personaje){
        if(personaje.getNivel() == this.nivel) return this.calcularPoderDeAtaque(12) < 5;
        else return Math.abs(this.getNivel() - personaje.getNivel()) <= 2;
    }

    public List<Personaje> buscarOponentes(List<Personaje> oponentes){
        return oponentes.stream()
                .filter(personaje -> this.esSimilar(personaje))
                .collect(Collectors.toList());
    }

}

public class Mago implements Rol{
    public double calcularValorBase(Personaje personaje){
        return (personaje.getInteligencia() + personaje.getNivel()) * 2;
    }

    public void incrementarHabilidades(Personaje personaje){
        personaje.subirInteligencia(personaje.getNivel() * 3/2);
    }
}


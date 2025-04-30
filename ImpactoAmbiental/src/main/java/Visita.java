import java.time.LocalDate;
import java.util.List;

public abstract class Visita {
    private LocalDate fecha;
    private double duracion;

    public Visita(LocalDate fecha, double duracion) {
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public double getDuracion(){
        return this.duracion;
    }


    public abstract double calcularImpactoAmbiental();

    public abstract List<Participante> getAsistentesDeVisita();
    
}

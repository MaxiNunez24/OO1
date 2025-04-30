import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Clase extends Servicio{
    protected LocalTime horaDeInicio;
    protected Entrenador entrenador;

    public Clase(LocalDate fecha, LocalTime horaDeInicio, Entrenador entrenador) {
        super(fecha);
        this.horaDeInicio = horaDeInicio;
        this.entrenador = entrenador;
    }

    public abstract double calcularCosto();

    protected boolean iniciaEnManiana(LocalTime hora_inicio){
        LocalTime inicio = LocalTime.of(7, 0);
        LocalTime fin = LocalTime.of(12, 0);
        return !hora_inicio.isBefore(inicio) && !hora_inicio.isAfter(fin);
    }

}

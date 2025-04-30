import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Servicio {
    protected LocalDate fecha;

    public abstract double calcularCosto();

    public Servicio(LocalDate fecha){
        this.fecha = fecha;
    }

    protected boolean esDomingo(LocalDate fecha){
        return fecha.getDayOfWeek() == DayOfWeek.SATURDAY;
    }
}

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Entrenador {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorariosManiana;
    private double honorariosTarde;

    public Entrenador(String nombre, LocalDate fechaIngreso, double honorariosManiana, double honorariosTarde) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorariosManiana = honorariosManiana;
        this.honorariosTarde = honorariosTarde;
    }

    private long calcularDiferenciaEnAnios(LocalDate inicio, LocalDate fin) {
        return ChronoUnit.YEARS.between(inicio, fin);
    }

    public int getAntiguedad(LocalDate hoy){
        return (int)calcularDiferenciaEnAnios(this.fechaIngreso, hoy);
    }

    public double getHonorarios(boolean aLaManiana){
        return aLaManiana ? honorariosManiana : honorariosTarde;
    }
}

import java.time.LocalDate;
import java.time.LocalTime;

public class ClasePersonalizada extends Clase{
    private Socio socio;

    public ClasePersonalizada(LocalDate fecha, LocalTime horaDeInicio, Entrenador entrenador, Socio socio){
        super(fecha, horaDeInicio, entrenador);
        this.socio = socio;
    }

    public double calcularCosto() {
        double honorariosEntrenador = this.entrenador.getHonorarios(this.iniciaEnManiana(this.horaDeInicio));
        double adicionalDomingo = this.esDomingo(this.fecha) ? 500 : 0;
        double adicionalAntiguedad = this.entrenador.getAntiguedad(this.fecha) * 400;
        return honorariosEntrenador + adicionalDomingo + adicionalAntiguedad;
    }
}

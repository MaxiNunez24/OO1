import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ClaseGrupal extends Clase{
    private List<Socio> socios;

    public ClaseGrupal(LocalDate fecha, LocalTime horaDeInicio, Entrenador entrenador, List<Socio> socios){
        super(fecha, horaDeInicio, entrenador);
        this.socios = socios;
    }

    public double calcularCosto(){
        int cantSocios = socios.size();
        double honorariosEntrenador = this.entrenador.getHonorarios(this.iniciaEnManiana(this.horaDeInicio)) / cantSocios;
        double adicionalDomingo = this.esDomingo(this.fecha) ? 800 * cantSocios : 0;
        double adicionalAntiguedad = (this.entrenador.getAntiguedad(this.fecha) * 250) / cantSocios;
        return honorariosEntrenador + adicionalDomingo + adicionalAntiguedad;
    }
}

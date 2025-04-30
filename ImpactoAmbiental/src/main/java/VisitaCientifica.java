import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class VisitaCientifica extends Visita{
    private List<Participante> investigadores;
    private List<ZonaRestringida> zonasRestringidas;

    public VisitaCientifica(LocalDate fecha, double duracion, List<Participante> investigadores, List<ZonaRestringida> zonasRestringidas){
        super(fecha, duracion);
        this.investigadores = investigadores;
        this.zonasRestringidas = zonasRestringidas;
    }

    public double calcularImpactoAmbiental(){
        return 50 + (5 * (this.getDuracion() - 1)) + (100 * zonasRestringidas.size());
    }

    public List<Participante> getAsistentesDeVisita(){
        return Participante.sortParticipantes(this.investigadores);
    }
}

import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class VisitaRecreativa extends Visita{
    private List<Participante> participantes;
    public VisitaRecreativa(LocalDate fecha, double duracion, List<Participante> participantes) {
        super(fecha, duracion);
        this.participantes = participantes;
    }

    public double calcularImpactoAmbiental() {
        return participantes.size() * this.getDuracion();
    }

    public List<Participante> getAsistentesDeVisita(){
        return Participante.sortParticipantes(this.participantes);
    }
}

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class VisitaEducativa extends Visita {
    private List<Grupo> grupos;
    public VisitaEducativa(LocalDate fecha, double duracion, List<Grupo> grupos) {
        super(fecha, duracion);
        this.grupos = grupos;
    }

    public double calcularImpactoAmbiental(){
        double duracion = this.getDuracion();
        return grupos.stream().mapToDouble(grupo -> grupo.calcularImpactoAmbiental(duracion)).sum();
    }

    public List<Participante> getAsistentesDeVisita(){
        List<Participante> participantes = new LinkedList<>();
        grupos.forEach(grupo -> {
            participantes.addAll(Participante.sortParticipantes(grupo.getAsistentesDeVisita()));
        });
        return participantes;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Grupo {
    private String nombreDelColegio;
    private String identificadorDeGrupo;
    private List<Participante> alumnos;
    private List<Participante> docentes;

    public Grupo(String nombreDelColegio, String identificadorDeGrupo, List<Participante> alumnos, List<Participante> docentes) {
        this.nombreDelColegio = nombreDelColegio;
        this.identificadorDeGrupo = identificadorDeGrupo;
        this.alumnos = alumnos;
        this.docentes = docentes;
    }

    public double calcularImpactoAmbiental(double duracion){
        double impactoAlumnos = duracion * this.alumnos.size() * 0.5;
        double impactoDocentes = duracion * this.docentes.size();
        double impactoTotal = (2 * duracion) + (impactoAlumnos - impactoDocentes);
        return impactoTotal < 2 ? 2 : impactoTotal;
    }

    public List<Participante> getAsistentesDeVisita(){
        List<Participante> participantes = new LinkedList<>(Participante.sortParticipantes(this.alumnos));
        participantes.addAll(Participante.sortParticipantes(this.docentes));
        return participantes;
    }
}

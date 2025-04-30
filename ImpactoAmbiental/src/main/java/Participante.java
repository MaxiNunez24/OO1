import java.util.List;
import java.util.stream.Collectors;

public class Participante {
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static List<Participante> sortParticipantes(List<Participante> participantes){
        return participantes.stream()
                .sorted((part1, part2) ->
                        part1.getNombre().compareTo(part2.getNombre()))
                .collect(Collectors.toList());
    }
}

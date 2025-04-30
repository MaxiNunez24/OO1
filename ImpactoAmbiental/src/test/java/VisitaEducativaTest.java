import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class VisitaEducativaTest {
    private VisitaEducativa visitaEducativa;
    private List<Grupo> grupos;

    @BeforeEach
    public void setUp(){
        grupos = new LinkedList<>(List.of(
                new Grupo(
                        "Colegio1",
                        "c1",
                        new LinkedList<>(List.of(
                                new Participante("Pedro"),
                                new Participante("Alfonso"),
                                new Participante("José"),
                                new Participante("Martin"),
                                new Participante("Pepe")
                        )),
                        new LinkedList<>(List.of(
                                new Participante("Profe1"),
                                new Participante("Profe2")
                        ))
                ),
                // Impacto Ambiental: (0.5 * 5 * 2) - (1 * 2 * 2) = 1
                new Grupo(
                        "Colegio2",
                        "c2",
                        new LinkedList<>(List.of(
                                new Participante("Martin"),
                                new Participante("Pepe")
                        )),
                        new LinkedList<>(List.of(
                                new Participante("Profe1"),
                                new Participante("Profe2"),
                                new Participante("Profe3")
                        ))
                )
                // Impacto Ambiental: (0.5 * 2 * 2) - (1 * 3 * 2) = 2 (como mínimo)

        ));
        visitaEducativa = new VisitaEducativa(
                LocalDate.now(),
                2,
                grupos
        );
    }

    @Test
    public void testCalcularImpactoAmbiental(){
        assertEquals(7, visitaEducativa.calcularImpactoAmbiental());
    }


}

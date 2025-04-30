import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class VisitaRecreativaTest {
    private List<Participante> participantes;
    private VisitaRecreativa visitaRecreativa;

    @BeforeEach
    public void setUp(){
        participantes = new LinkedList<>(List.of(new Participante("Pedro"), new Participante("Gastón"), new Participante("Rodrigo"), new Participante("Martin"), new Participante("Juan")));
        visitaRecreativa = new VisitaRecreativa(LocalDate.now(), 2.0, participantes);
    }

    @Test
    public void testCalcularImpactoAmbiental(){
        assertEquals(10, visitaRecreativa.calcularImpactoAmbiental());
    }

}

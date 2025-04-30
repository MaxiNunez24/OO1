import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClaseGrupalTest {
    private ClaseGrupal claseGrupal;

    @BeforeEach
    public void setUp(){
        ArrayList<Servicio> servicios = new ArrayList<>();
        servicios.add(claseGrupal);

        List<Socio> socios = List.of(
                new Socio("Pepe", LocalDate.now(), LocalDate.now(),servicios)
        );
        claseGrupal = new ClaseGrupal(LocalDate.now(), LocalTime.now(), new Entrenador(
                "Pedro", LocalDate.now(), 100, 70
        ), socios
        );
    }

    @Test
    public void calcularCostoTest(){
        assertEquals(70, claseGrupal.calcularCosto());// 70 / 1 + 0 + 0
    }
}

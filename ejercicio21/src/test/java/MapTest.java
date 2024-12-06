import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    private Map<String, Integer> jugadores;

    @BeforeEach
    public void setUp() {
        jugadores = new HashMap<>();
        jugadores.put("Lionel Messi", 111);
        jugadores.put("Gabriel Batistuta", 56);
        jugadores.put("Kun Agüero", 42);
    }

    @Test
    public void eliminarTest(){
        assertEquals(42, jugadores.remove("Kun Agüero"));
    }

    @Test
    public void actualizarTest(){
        assertTrue(jugadores.replace("Lionel Messi", 111, 112));
    }

    @Test
    public void agregarduplicadoTest(){
        assertEquals(56, jugadores.put("Gabriel Batistuta", 24));
    }

    @Test
    public void totalGolesTest(){
        assertEquals(
                209,jugadores.values().stream()
                        .mapToInt(Integer::intValue) // es lo mismo que goles -> goles
                        .sum()
        );
    }

}


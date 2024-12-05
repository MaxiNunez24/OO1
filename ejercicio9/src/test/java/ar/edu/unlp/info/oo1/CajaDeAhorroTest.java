package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CajaDeAhorroTest {
    private CajaDeAhorro caja, caja2;

    @BeforeEach
    void  setup() throws Exception {
        caja = new CajaDeAhorro();
        caja.depositar(400);
    }

    @Test
    public void testDepositar() {
        caja.depositar(200);
        assertEquals(600,caja.getSaldo());
    }

    // Importa el orden de los tests? Nop
    // Tengo que testear los tests abstractos? Sip, siempre que sean públicos
    @Test
    public void testPuedeExtraer(){
        assertTrue(caja.puedeExtraer(400 - 400*1.02));
        assertFalse(caja.puedeExtraer(500));
    }

    // Sólo se testea lo público al menos que diga lo contrario!
    @Test
    public void testExtraer() {
        // Test de equivalencia
        assertTrue(caja.extraer(100));
        assertEquals(300,caja.getSaldo());
        assertFalse(caja.extraer(500));
        assertEquals(300,caja.getSaldo());
    }

    @Test
    public void testTransferir(){
        caja2 = new CajaDeAhorro();
        caja2.depositar(300);
        // Tests de borde
        assertTrue(caja2.transferirACuenta(300 - 300 * 1.02, caja));
        assertFalse(caja2.transferirACuenta(500, caja));
    }


}

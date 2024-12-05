package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {
    private CuentaCorriente cuentaCorriente, cuentaCorriente2;

    @BeforeEach
    public void setUp() {
        cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.depositar(100);
        cuentaCorriente.setDescubierto(500);
    }

    @Test
    public void testDepositar() {
        cuentaCorriente.depositar(600);
        assertEquals(1200, cuentaCorriente.getSaldo());
    }

    @Test
    public void testPuedeExtraer(){
        assertTrue(cuentaCorriente.puedeExtraer(600));
        assertFalse(cuentaCorriente.puedeExtraer(1200));
    }

    @Test
    public void testExtraer() {
        assertFalse(cuentaCorriente.extraer(1200));
        assertTrue(cuentaCorriente.extraer(600));
        assertFalse(cuentaCorriente.extraer(200));
    }

    @Test
    public void testTransferir(){
        cuentaCorriente2 = new CuentaCorriente();
        cuentaCorriente2.depositar(600);
        assertTrue(cuentaCorriente2.transferirACuenta(600,cuentaCorriente));
        assertFalse(cuentaCorriente2.transferirACuenta(200,cuentaCorriente));
    }
}

package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversorTest {

    private Inversor inversor;
    private Inversion plazoFijo1;
    private Inversion plazoFijo2;
    private Inversion inversionEnAcciones1;
    private Inversion inversionEnAcciones2;


    @BeforeEach
    public void setup(){
        inversor = new Inversor("Juan");
        plazoFijo1 = new PlazoFijo(LocalDate.of(2021, 1, 1), 1000.0, 0.01);
        plazoFijo2 = new PlazoFijo(LocalDate.of(2024, 4, 2), 2000.0, 0.4);
        inversionEnAcciones1 = new InversionEnAcciones("GGAL", 10, 100.0);
        inversionEnAcciones2 = new InversionEnAcciones("YPF", 50, 20.0);
        inversor.agregarInversion(plazoFijo1);
        inversor.agregarInversion(inversionEnAcciones1);
        inversor.agregarInversion(plazoFijo2);
        inversor.agregarInversion(inversionEnAcciones2);
    }

    @Test
    public void valorActualTest(){
        assertEquals(
                50*20+10*100+1000*0.01*LocalDate.of(2021, 1, 1).until(LocalDate.now()).getDays()+2000*0.4*LocalDate.of(2024, 4, 2).until(LocalDate.now()).getDays(), inversor.valorActual()
        );
    }
}

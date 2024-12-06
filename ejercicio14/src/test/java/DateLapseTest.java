import ar.edu.unlp.info.oo1.DateLapse;
import ar.edu.unlp.info.oo1.DateLapseA;
import ar.edu.unlp.info.oo1.DateLapseB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseTest {
    private DateLapse dateLapse;

    @BeforeEach
    public void setUp() {
        dateLapse = new DateLapseB(LocalDate.of(2020, 5, 27),LocalDate.of(2024, 12, 6));
    }

    @Test
    public void sizeInDaysTest(){
        assertEquals(dateLapse.sizeInDays(), (LocalDate.of(2020, 5, 27).until(LocalDate.of(2024, 12, 6), ChronoUnit.DAYS)));
        dateLapse = new DateLapseA(LocalDate.of(2023, 12, 6),LocalDate.of(2024, 12, 6));
        assertEquals(366, dateLapse.sizeInDays());
    }

    @Test
    public void includesDateTest(){
        assertTrue(dateLapse.includesDate(LocalDate.of(2020, 5, 27)));
        assertTrue(dateLapse.includesDate(LocalDate.of(2024, 12, 5)));
    }

    public void getFromTest(){
        assertEquals(LocalDate.of(2020, 5, 27), dateLapse.getFrom());
    }

    public void getToTest(){
        assertEquals(LocalDate.of(2024, 12, 6), dateLapse.getTo());
    }

}

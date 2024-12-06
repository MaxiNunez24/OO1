package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseB implements DateLapse {
    private LocalDate from;
    private int sizeInDays;

    public DateLapseB(LocalDate from, LocalDate to) {
        this.from = from;
        this.sizeInDays = (int) from.until(to, ChronoUnit.DAYS);
    }

    public LocalDate getFrom() {
        return from;
    }

    public int sizeInDays() {
        return sizeInDays;
    }

    public LocalDate getTo() {
        return from.plusDays(sizeInDays);
    }

    public boolean includesDate(LocalDate date) {
        return from.isEqual(date) || from.plusDays(sizeInDays).isEqual(date) || from.isBefore(date) && from.plusDays(sizeInDays).isAfter(date);
    }


}

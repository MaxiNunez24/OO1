package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseA implements DateLapse{
    private LocalDate from;
    private LocalDate to;

    public DateLapseA(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int sizeInDays(){
            return (int) ChronoUnit.DAYS.between(from, to);
    }

    public boolean includesDate(LocalDate other){
        return other.isEqual(from) || other.isEqual(to) || other.isAfter(from) && other.isBefore(to);
    }


}

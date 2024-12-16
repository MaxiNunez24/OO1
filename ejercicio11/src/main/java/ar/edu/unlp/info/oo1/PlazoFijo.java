package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class PlazoFijo implements Inversion{
    private LocalDate fechaDeConstitucion;
    private Double montoDepositado;
    private Double porcentajeDeInteresDiario;

    public PlazoFijo(LocalDate fechaDeConstitucion, Double montoDepositado, Double porcentajeDeInteresDiario) {
        this.fechaDeConstitucion = fechaDeConstitucion;
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    public double calcularValor() {
        return this.montoDepositado * (porcentajeDeInteresDiario * fechaDeConstitucion.until(LocalDate.now()).getDays());
    }
}

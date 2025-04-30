import java.time.LocalDate;

public class UsoLibre extends Servicio{
    private double cantHoras;
    private Socio socio;

    public UsoLibre(LocalDate fecha, double cantHoras, Socio socio) {
        super(fecha);
        this.cantHoras = cantHoras;
        this.socio = socio;
    }

    public double calcularCosto(){
        double descuento = socio.aplicoDescuento() ?  0.90 : 1;
        return Math.floor(cantHoras) * 300 * descuento;
    }
}

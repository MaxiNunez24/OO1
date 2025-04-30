import java.time.LocalDate;
import java.util.List;

public class Socio {
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private List<Servicio> servicios;

    public Socio(String nombre, LocalDate fechaNacimiento, LocalDate fechaIngreso, List<Servicio> servicios) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.servicios = servicios;
    }

    public boolean aplicoDescuento(){
        return servicios.size() >= 5;
    }

    public double calcularMontoEnFecha(LocalDate fecha){
        return servicios.stream()
                .filter(servicio -> servicio.fecha.equals(fecha))
                .mapToDouble(servicio -> servicio.calcularCosto())
                .sum();
    }
}

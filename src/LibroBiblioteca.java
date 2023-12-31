import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibroBiblioteca extends Libro implements Biblioteca{

    private long deuda, diasRetraso;
    private boolean moroso;
    private String estadoVencimiento;

    public LibroBiblioteca(String nombre, String autor, String estado, String DNI,
                           LocalDate fechaSolicitud, LocalDate fechaEntrega) {
        super(nombre, autor, estado, DNI, fechaSolicitud, fechaEntrega);

        this.calcularDiasRetraso();
        this.calcularDeuda();
        this.esMoroso();
    }

    @Override
    public void calcularDiasRetraso() {
        this.setDiasRetraso(ChronoUnit.DAYS.between(getFechaEntrega(), LocalDate.now()));
        if (this.getDiasRetraso() > 10) this.setEstadoVencimiento("VENCIDO");
        else this.setEstadoVencimiento("EN REGLA");
    }

    @Override
    public void calcularDeuda() {
        this.setDeuda(this.getDiasRetraso());
    }

    @Override
    public void esMoroso() {
        this.setMoroso(this.getDiasRetraso() > 1);
    }

    public long getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(long diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public long getDeuda() {
        return deuda;
    }

    public void setDeuda(long deuda) {
        this.deuda = deuda;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public String getEstadoVencimiento() {return estadoVencimiento;}

    public void setEstadoVencimiento(String estadoVencimiento) {this.estadoVencimiento = estadoVencimiento;}

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", estado='" + estado + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaSolicitud=" + fechaSolicitud +
                ", fechaEntrega=" + fechaEntrega +
                ", deuda=" + deuda +
                ", diasRetraso=" + diasRetraso +
                ", moroso=" + moroso +
                ", estadoVencimiento=" + estadoVencimiento +
                '\n';
    }
}
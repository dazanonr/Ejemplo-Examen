import java.time.LocalDate;

public class Libro {

    String nombre, autor, estado, DNI;
    LocalDate fechaSolicitud, fechaEntrega;

    public Libro(String nombre, String autor, String estado, String DNI,
                 LocalDate fechaSolicitud, LocalDate fechaEntrega) {
        this.nombre = nombre;
        this.autor = autor;
        this.estado = estado;
        this.DNI = DNI;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
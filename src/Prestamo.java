import java.util.Date;

public class Prestamo {

    private Cliente cliente;
    private Pelicula pelicula;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(Cliente cliente, Pelicula pelicula, Date fechaPrestamo, Date fechaDevolucion) {
        super();
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }



    public Prestamo() {
        super();
    }



    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}

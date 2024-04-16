public class Cliente {

    private int numeroCarnet;
    private String nombre;


    public Cliente(int numeroCarnet, String nombre) {
        super();
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
    }


    public Cliente() {
        super();
    }


    public int getNumeroCarnet() {
        return numeroCarnet;
    }
    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

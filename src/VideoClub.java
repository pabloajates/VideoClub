import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VideoClub {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Cliente> listadoClientes = new ArrayList<Cliente>();
    ArrayList<Prestamo> listadoPrestamos = new ArrayList<Prestamo>();
    ArrayList<Pelicula> listadoPeliculas = new ArrayList<Pelicula>();

    public void addCliente() {
        Cliente cliente = new Cliente();
        int num = listadoClientes.size() +1;
        System.out.println("Tu numero de carnet sera: "+num );

        cliente.setNumeroCarnet(num);

        System.out.println("Ahora dame tu nombre:");
        String nombre = sc.nextLine();
        cliente.setNombre(nombre);

        listadoClientes.add(cliente);
    }

    public void addPelicula() {
        Pelicula pelicula = new Pelicula();
        int num = listadoPeliculas.size() +1;
        System.out.println("El codigo de la pelicula sera: " +num);

        pelicula.setCodigo(num);

        System.out.println("Ahora dame el nombre:");
        String nombre = sc.nextLine();
        pelicula.setTitulo(nombre);
        listadoPeliculas.add(pelicula);
    }

    public void addPrestamo() {
        Prestamo prestamo = new Prestamo();

        System.out.println("Dime el numero de carnet del cliente");
        int carnet = sc.nextInt();

        boolean encontrada = false;
        for (Cliente cliente : listadoClientes) {
            if (cliente.getNumeroCarnet() == carnet) {
                System.out.println("Cliente asignado al prestamo");
                prestamo.setCliente(cliente);
                encontrada = true;
                break;
            }

            if(!encontrada) {
                System.out.println("Error ese cliente no existe");
            }

        }

        System.out.println("Dame el codigo de la peli");
        int codPeli = sc.nextInt();

        for (Pelicula pelicula : listadoPeliculas) {
            if (pelicula.getCodigo() == codPeli) {
                System.out.println("Pelicula asignada al prestamo");
                prestamo.setPelicula(pelicula);
                encontrada = true;
                break;
            }

            if(!encontrada) {
                System.out.println("Esa peli no la tenemos, busca otra");
            }
        }

        System.out.println("Cuantos dias es el prestamo");
        int dias = sc.nextInt();

        Date fechaActual = new Date();

        prestamo.setFechaPrestamo(fechaActual);

        prestamo.setFechaDevolucion(null);

        listadoPrestamos.add(prestamo);
    }

    public void buscarPelicula() {
        System.out.println("Dime el nombre de la pelicula");
        String nombre = sc.nextLine();
        nombre = nombre.toLowerCase();

        boolean encontrada = false;

        for (Pelicula pelicula : listadoPeliculas) {
            if (pelicula.getTitulo().equals(nombre)) {
                System.out.println("Esta pelicula si que la tenemos");
                encontrada = true;
                break;
            }

        }

        if(!encontrada) {
            System.out.println("Esa peli no la tenemos, busca otra");
        }
    }

    public void buscarCliente() {
        System.out.println("Dime el numero de carnet");
        int carnet = sc.nextInt();

        boolean encontrada = false;

        for (Cliente cliente : listadoClientes) {
            if (cliente.getNumeroCarnet() == carnet) {
                System.out.println("Cliente encontrado: " +cliente.getNombre());
                encontrada = true;
                break;
            }

        }
        if(!encontrada) {
            System.out.println("Este cliente no existe");
        }
    }

    public void verPrestamos() {
        if(listadoPrestamos.size() == 0){
            System.out.println("Todavia no hay ningun moroso");
        }else {
            for(Prestamo prestamo : listadoPrestamos) {
                if(prestamo.getFechaDevolucion() == null) {
                    System.out.println("Cliente                 Pelicula                   Fecha Prestamo");
                    System.out.println(prestamo.getCliente().getNombre()+"               " +prestamo.getPelicula().getTitulo()+"                  " +prestamo.getFechaPrestamo());
                }
            }
        }
    }

    public void verPelis() {
        if(listadoPeliculas.size() == 0){
            System.out.println("Todavia no hay ninguna pelicula");
        }else {
            for(Pelicula pelicula : listadoPeliculas) {
                System.out.println("Codigo                Titulo");
                System.out.println(pelicula.getCodigo()+"                     "+pelicula.getTitulo());
            }
        }
    }

    public void verClientes() {
        if(listadoClientes.size() == 0){
            System.out.println("Todavia no hay ningun cliente");
        }else {
            for(Cliente cliente : listadoClientes) {
                System.out.println("Numero de carnet               Nombre");
                System.out.println(cliente.getNumeroCarnet()+"                              "+cliente.getNombre());
            }
        }
    }

    public void devolucion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Y el título de la película:");
        String titulo = sc.nextLine();

        Date fechaDevolucion = new Date();

        for (Prestamo prestamo : listadoPrestamos) {
            if (nombre.equals(prestamo.getCliente().getNombre()) && titulo.equals(prestamo.getPelicula().getTitulo())) {
                prestamo.setFechaDevolucion(fechaDevolucion);
                System.out.println("La película ha sido devuelta con éxito el " + fechaDevolucion);
                return;
            }
        }

        System.out.println("No se encontró un préstamo registrado con ese nombre y título.");
    }

    public void listadoDevoluciones() {
        if(listadoPrestamos.size() == 0) {
            System.out.println("Todavia no hay ninguna devolucion");
        } else {


            for(Prestamo prestamo : listadoPrestamos) {
                if(prestamo.getFechaDevolucion() != null) {
                    System.out.println("Cliente                 Pelicula                   Fecha Prestamo                Fecha Devolucion");
                    System.out.println(prestamo.getCliente().getNombre()+"               " +prestamo.getPelicula().getTitulo()+"                  " +prestamo.getFechaPrestamo()+"           "+prestamo.getFechaDevolucion());
                }
            }
        }
    }
}

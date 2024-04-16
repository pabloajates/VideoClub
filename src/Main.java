import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        VideoClub videoclub = new VideoClub();

        int opcion = 0;

        do {
            System.out.println("------VIDEOCLUB------- \r"
                    + "1. Prestamos \r"
                    + "2. Devolucion\r"
                    + "3. Añadir cliente \r"
                    + "4. Listado clientes\r"
                    + "5. Buscar cliente\r"
                    + "6. Añadir pelicula\r"
                    + "7. Listado peliculas\r"
                    + "8. Buscar pelicula\r"
                    + "9. Listado devoluciones\r"
                    + "10. Listado morosos\r"
                    + "11. Salir");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    videoclub.addPrestamo();
                    break;
                case 2:
                    videoclub.devolucion();
                    break;
                case 3:
                    videoclub.addCliente();
                    break;
                case 4:
                    videoclub.verClientes();
                    break;
                case 5:
                    videoclub.buscarCliente();
                    break;
                case 6:
                    videoclub.addPelicula();
                    break;
                case 7:
                    videoclub.verPelis();
                    break;
                case 8:
                    videoclub.buscarPelicula();
                    break;
                case 9:
                    videoclub.listadoDevoluciones();
                    break;
                case 10:
                    videoclub.verPrestamos();
                    break;
                default:
                    break;
            }

        } while (opcion != 11);
    }
    }
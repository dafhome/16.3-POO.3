import java.util.ArrayList;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {


        ArrayList<Vinilos> tienda = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Vinilos v1 = new Vinilos("Pink Floyd", "The Dark Side of the Moon", 22.99, 10, 2023);
        Vinilos v2 = new Vinilos("Harry Styles", "Harry's House", 29.99, 13, 2022);
        Vinilos v3 = new Vinilos("Madonna", "Celebration 4 Discos", 58.99, 36, 2024);
        Vinilos v4 = new Vinilos("Shakira", "Las Mujeres ya no Lloran - Ruby Edition", 41.99, 17, 2024);
        Vinilos v5 = new Vinilos("Michael Jackson", "Thriller", 23.99, 7, 2001);

        tienda.add(v1);
        tienda.add(v2);
        tienda.add(v3);
        tienda.add(v4);
        tienda.add(v5);

        boolean validar = false;

        while (!validar) {

            System.out.println("----------------TIENDA DE VINILOS----------------");
            System.out.println("Hola! En que te puedo ayudar?");
            System.out.println();
            System.out.println("1.Añadir otro disco.");
            System.out.println("2.Mostrar todos los discos.");
            System.out.println("3.Modificar un disco.");
            System.out.println("4.Eliminar un disco.");
            System.out.println("0.Salir");
            System.out.print("Opcion: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    Vinilos.añadirVinilo(tienda,scan);
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    Vinilos.mostrarVinilos(tienda);
                    break;
                case 3:
                    Vinilos.modificarVinilo(tienda, scan);
                    break;
                case 4:
                    Vinilos.eliminarVinilo(tienda, scan);
                    break;
                case 0:
                    validar = true;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Hasta otro día! Gracias por venir.");
                    break;

                default:
                    break;
            }

        }


        

        // Instructions
        // Crear un arraylist con al menos 5 discos, con los datos: Artista, título,
        // año, duración (pueden ser otros).

        // - Mostrar todos los discos, con todos los datos

        // - Mostrar uno determinado: por ejemplo el año del tercer disco (esto lo
        // podría pedir el cliente, o no)

        // - Cambiar ese mismo año (esto lo podría pedir el cliente, o no) y mostrar ese
        // cambio. A ver si lo encontráis!

        // - Etc hacer pruebas

        // EXTRA: buscador con contains() o con equals(). Que el usuario escriba nombre
        // de artista y me diga si está, y en qué posición está.

        // NIVEL 2
        // Que todos estos datos los entre el cliente: usuario entra Artista, título,
        // año y duración (no hace falta hacer un CRUD entero).

    }
   
}

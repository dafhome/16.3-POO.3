import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Vinilos {

    private String artista;
    private String disco;
    private double precio;
    private int canciones;
    private int year;

    public Vinilos(String artista, String disco, double precio, int canciones, int year) {
        this.artista = artista;
        this.disco = disco;
        this.precio = precio;
        this.canciones = canciones;
        this.year = year;
    }

    public Vinilos() {
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Artista: " + artista + ", Disco: " + disco + ", Precio: " + precio + " €, Canciones: " + canciones
                + ", Año: " + year;
    }

    public static void añadirVinilo(ArrayList<Vinilos> tienda, Scanner scan) {
        boolean validar = false;
        System.out.print("Artista: ");
        String a = scan.nextLine();
        System.out.print("Disco: ");
        String b = scan.nextLine();
        System.out.print("Precio: ");
        double c = 0f;
        while (!validar) {

            if (scan.hasNextDouble()) {
                validar = true;
                c = scan.nextDouble();
            } else {
                System.out.print("Introduce un valor correcto:");
                scan.next();
            }

        }
        scan.nextLine();
        System.out.print("Canciones: ");
        validar = false;
        int d = 0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                d = scan.nextInt();
            } else {
                System.out.print("Introduce un valor correcto:");
                scan.next();
            }

        }
        scan.nextLine();
        System.out.print("Año: ");
        validar = false;
        int e = 0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                e = scan.nextInt();
            } else {
                System.out.print("Introduce un valor correcto:");
                scan.next();
            }

        }
        scan.nextLine();

        tienda.add(new Vinilos(a, b, c, d, e));
        int index = tienda.size() - 1;
        System.out.println();
        System.out.println("Has introducido correctamente el vinilo:");
        System.out.println(tienda.get(index));
        System.out.println();
    }

    public static void mostrarVinilos(ArrayList<Vinilos> tienda) {
        System.out.println();
        System.out.println("Aquí está nuestro catálogo:");
        System.out.println("-------------------------------------------------");
        for (Vinilos vinilos : tienda) {
            System.out.println(vinilos);
        }
        System.out.println();
    }

    public static void modificarVinilo(ArrayList<Vinilos> tienda, Scanner scan) {
        System.out.println();
        System.out.println("Vamos a modificar un vinilo");
        System.out.print("Indicame de que artista es:");
        String buscar = scan.nextLine();
        int coincidencias = 0;
        int index = 0;
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getArtista().equalsIgnoreCase(buscar)) {
                coincidencias++;
                index = i;
            }
        }
        if (coincidencias == 1) {
            System.out.println("El vinilo a modificar es:");
            System.out.println(tienda.get(index));
            System.out.println("Que quieres cambiar?");
            System.out.println("1.Artista");
            System.out.println("2.Disco");
            System.out.println("3.Precio");
            System.out.println("4.Canciones");
            System.out.println("5.Año");
            System.out.println("0.Todo");
            String a;
            String b;
            double c = 0;
            int d = 0;
            int e = 0;
            boolean validar = false;

            while (!validar) {
                System.out.print("Opcion: ");
                String option = scan.nextLine();
    
                switch (option) {
                    case "1":
                        System.out.print("Artista nuevo: ");
                        a = scan.nextLine();
                        tienda.get(index).setArtista(a);
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    case "2":
                        System.out.print("Disco nuevo: ");
                        b = scan.nextLine();
                        tienda.get(index).setDisco(b);
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    case "3":
                        System.out.print("Precio nuevo: ");
                        c = scan.nextDouble();
                        tienda.get(index).setPrecio(c);
                        scan.nextLine();
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    case "4":
                        System.out.print("Canciones: ");
                        d = scan.nextInt();
                        tienda.get(index).setCanciones(d);
                        scan.nextLine();
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    case "5":
                        System.out.print("Año: ");
                        e = scan.nextInt();
                        tienda.get(index).setYear(e);
                        scan.nextLine();
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    case "0":
                        System.out.print("Artista nuevo: ");
                        a = scan.nextLine();
                        tienda.get(index).setArtista(a);
                        System.out.print("Disco nuevo: ");
                        b = scan.nextLine();
                        tienda.get(index).setDisco(b);
                        System.out.print("Precio nuevo: ");
                        c = scan.nextDouble();
                        tienda.get(index).setPrecio(c);
                        scan.nextLine();
                        System.out.print("Canciones: ");
                        d = scan.nextInt();
                        tienda.get(index).setCanciones(d);
                        scan.nextLine();
                        System.out.print("Año: ");
                        e = scan.nextInt();
                        tienda.get(index).setYear(e);
                        scan.nextLine();
                        validar=true;
                        System.out.println("Se ha modificado correctamente.");
                        System.out.println();
                        break;
    
                    default:
                        System.out.println("Introduce una opcion correcta.");
                        break;
                }
            }

        } else{
            System.out.println("Lo siento, no hemos encontrado una coincidencia única. Prueba con otro artísta.");
            System.out.println();
        }
            
    }

    public static void eliminarVinilo(ArrayList<Vinilos> tienda, Scanner scan){
        System.out.println();
        System.out.println("Vamos a eliminar un vinilo");
        System.out.print("Indicame de que artista es:");
        String buscar = scan.nextLine();
        int coincidencias = 0;
        String verificar;
        int index = 0;
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getArtista().equalsIgnoreCase(buscar)) {
                coincidencias++;
                index = i;
            }

        }
        if (coincidencias==1) {
            System.out.println("El vinilo a eliminar es:");
            System.out.println(tienda.get(index));
            System.out.print("Estás seguro? Indica si para borrar: ");
            verificar = scan.nextLine();
            if (verificar.equalsIgnoreCase("si")) {
                tienda.remove(index);
                System.out.println("Hemos eliminado el disco correctamente.");
                System.out.println();
            }
            else{
                System.out.println("No lo hemos eliminado.");
                System.out.println();
            }
                
        }

        else{
            System.out.println("Lo siento, no hemos encontrado una coincidencia única. Prueba con otro artísta.");
            System.out.println();
        }
            
        

    }

}

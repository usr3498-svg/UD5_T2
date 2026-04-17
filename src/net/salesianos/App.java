package net.salesianos;

import net.salesianos.plato.Plato;
import net.salesianos.plato.ServicioPlato;
import net.salesianos.plato.ValidacionesPlato;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ServicioPlato servicio = new ServicioPlato();
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("1. Añadir");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");

            String opcion = sc.nextLine();

            if (opcion.equals("1")) {

                System.out.println("Nombre:");
                String nombre = ValidacionesPlato.texto(sc.nextLine());

                System.out.println("Tipo de pez:");
                String tipo = ValidacionesPlato.texto(sc.nextLine());

                System.out.println("Precio:");
                int precio = ValidacionesPlato.numero(sc.nextLine());

                System.out.println("Puntuación:");
                int puntuacion = ValidacionesPlato.puntuacion(sc.nextLine());

                if (nombre != null && tipo != null && precio != -1 && puntuacion != -1) {
                    servicio.add(new Plato(nombre, tipo, precio, puntuacion));
                }

            }

            if (opcion.equals("2")) {
                System.out.println(servicio.getAll());
            }

            if (opcion.equals("3")) {
                System.out.println(servicio.getAll());
                System.out.println("Índice a eliminar:");
                int i = Integer.parseInt(sc.nextLine());
                servicio.remove(i);
            }

            if (opcion.equals("4")) {
                
                System.out.println("Saliendo...");
                break;
            }
        }

        sc.close();
    }
}
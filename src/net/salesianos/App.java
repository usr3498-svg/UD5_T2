package net.salesianos;
import javax.swing.*;

import net.salesianos.Hotel.Hoteles;
import net.salesianos.Hotel.ServicioHotel;
import net.salesianos.Hotel.ValidacionesHoteles;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ServicioHotel servicio = new ServicioHotel();
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("1. Añadir");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");

            String opcion = sc.nextLine();

            if (opcion.equals("1")) {

                System.out.println("Nombre:");
                String nombre = ValidacionesHoteles.texto(sc.nextLine());

                System.out.println("estrellas del hotel:");
                int estrellas = ValidacionesHoteles.numero(sc.nextLine());

                System.out.println("Precio:");
                int precio = ValidacionesHoteles.numero(sc.nextLine());

                System.out.println("Puntuación:");
                int puntuacion = ValidacionesHoteles.puntuacion(sc.nextLine());

                if (nombre != null && estrellas != -1  && precio != -1 && puntuacion != -1) {
                    servicio.add(new Hoteles(nombre, estrellas, precio, puntuacion));
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
package net.salesianos;

import javax.swing.*;
import net.salesianos.Hotel.*;

public class App {

    static ServicioHotel servicio = new ServicioHotel();

    public static void main(String[] args) {
        while (true) {
            String[] opciones = { "Añadir", "Mostrar", "Editar", "Eliminar", "Salir" };
            int op = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Hoteles",
                    0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (op == 0)
                añadir();
            else if (op == 1)
                mostrar();
            else if (op == 2)
                editar();
            else if (op == 3)
                eliminar();
            else {
                JOptionPane.showMessageDialog(null, "Hasta luego.");
                System.exit(0);
            }
        }
    }

    static void añadir() {
        String n = ValidacionesHoteles.texto(JOptionPane.showInputDialog("Nombre:"));
        int e = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Estrellas:"));
        int p = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Precio:"));
        int pu = ValidacionesHoteles.puntuacion(JOptionPane.showInputDialog("Puntuación:"));
        if (n != null && e != -1 && p != -1 && pu != -1)
            servicio.add(new Hoteles(n, e, p, pu));
        else
            JOptionPane.showMessageDialog(null, "Datos inválidos.");
    }

    static void mostrar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < servicio.getAll().size(); i++)
            sb.append(i + 1).append(": ").append(servicio.getAll().get(i)).append("\n");
        JOptionPane.showMessageDialog(null, sb.length() == 0 ? "No hay hoteles." : sb.toString());
    }

    static void editar() {
        int i = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Índice a editar:")) -1;
        if (i < 0 || i >= servicio.getAll().size()) {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
            return;
        }
        Hoteles h = servicio.getAll().get(i);
        String n = ValidacionesHoteles.texto(JOptionPane.showInputDialog("Nombre:", h.getNombre()));
        int e = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Estrellas:", h.getEstrellas()));
        int p = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Precio:", h.getPrecio()));
        int pu = ValidacionesHoteles.puntuacion(JOptionPane.showInputDialog("Puntuación:", h.getPuntuacion()));
        if (n != null && e != -1 && p != -1 && pu != -1) {
            h.setNombre(n);
            h.setEstrellas(e);
            h.setPrecio(p);
            h.setPuntuacion(pu);
        }
    }

    static void eliminar() {
        int i = ValidacionesHoteles.numero(JOptionPane.showInputDialog("Índice a eliminar:")) - 1;
        if (i >= 0 && i < servicio.getAll().size())
            servicio.remove(i);
        else
            JOptionPane.showMessageDialog(null, "Índice inválido.");
    }
}
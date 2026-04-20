package net.salesianos.Hotel;

public class Hoteles {
    private String nombre;
    private int estrellas;
    private int precio;
    private int puntuacion;

    public Hoteles(String nombre, int estrellas, int precio, int puntuacion) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.precio = precio;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrellas() {

        return estrellas;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + " | " + estrellas + " estrellas | " + precio + " euros | " + puntuacion + " || ";
    }

}
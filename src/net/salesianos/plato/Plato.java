package net.salesianos.plato;

public class Plato {
    private String nombre;
    private String tipoPez;
    private int precio;
    private int puntuacion;

    public Plato(String nombre, String tipoPez, int precio, int puntuacion) {
        this.nombre = nombre;
        this.tipoPez = tipoPez;
        this.precio = precio;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoPez() {

        return tipoPez;
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

    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return nombre + ", " + tipoPez + ", " + precio + "euros, " + puntuacion + " | ";
    }

}
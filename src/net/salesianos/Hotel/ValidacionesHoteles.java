package net.salesianos.Hotel;

public class ValidacionesHoteles {

    public static String texto(String texto) {
        if (texto == null) {
            return null;
        } else {
            return texto;
        }
    }

    public static int numero(String num) {
    try {
        return Integer.parseInt(num);
    } catch (Exception e) {
        return -1;
    }
}

    public static int puntuacion(String num) {
        int punt = numero(num);

        if (punt <= 0 || punt >= 6) {
            return -1;
        }

        return punt;
    }

    public static int estrellas(String num) {
        int estre = numero(num);

        if (estre <= 0 || estre >= 6) {
            return -1;
        }

        return estre;
    }


}
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

        String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].equals(num)) {
                return i;
            }
        }

        return -1;
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
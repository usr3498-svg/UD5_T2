package net.salesianos.plato;
import java.util.ArrayList;

public class ServicioPlato {

    ArrayList<Plato> platos = new ArrayList<>();

    public void add(Plato p) {
        platos.add(p);
    }

    public void remove(int i) {
    if (i >= 0 && i < platos.size()) {
        platos.remove(i);
    }
}

    public void update(int i, Plato p) {
        platos.set(i, p);
    }

    public ArrayList<Plato> getAll() {
        return platos;
    }

    
}
package net.salesianos.Hotel;
import java.util.ArrayList;

public class ServicioHotel {

    ArrayList<Hoteles> hoteles = new ArrayList<>();

    public void add(Hoteles p) {
        hoteles.add(p);
    }

    public void remove(int i) {
    if (i >= 0 && i < hoteles.size()) {
        hoteles.remove(i);
    }
}

    public void update(int i, Hoteles p) {
        hoteles.set(i, p);
    }

    public ArrayList<Hoteles> getAll() {
        return hoteles;
    }

    
}
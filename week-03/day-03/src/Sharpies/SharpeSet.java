package Sharpies;

import Sharpies.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpeSet {

    List<Sharpie> sharpies;

    public SharpeSet() {
        this.sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie sharpie : this.sharpies) {
            if (sharpie.inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {

        List<Sharpie> usable= new ArrayList<>();

        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                usable.add(sharpies.get(i));
            }
        }
        System.out.println("Empty sharpies removed!");

        sharpies = usable;
    }

    public List<Sharpie> getSharpies() {
        return sharpies;
    }
}
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
        for (Sharpie sharpie : this.sharpies){
            if (sharpie.inkAmount > 0){
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < this.sharpies.size(); i++) {
            if (this.sharpies.get(i).inkAmount <= 0) {
                this.sharpies.remove(i);
            }
        }
        System.out.println("Empty sharpies removed!");
    }

    public List<Sharpie> getSharpies() {
        return sharpies;
    }
}

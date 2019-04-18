import java.util.ArrayList;
import java.util.List;

public class Farm {

    static List<Animal> farm;
    static int slots;


    public Farm(int slots) {
        this.farm = new ArrayList<>();
        this.slots = slots;
    }

    public void breed(Animal animal) {
        if (slots > 0){
            farm.add(animal);
            slots--;
        } else {
            System.out.println("no free slots!");
        }
    }

    public static void slaughter() {
        int hunger = 0;

        for (Animal animal : farm){
            if (animal.hunger > hunger){
                hunger = animal.hunger;
            }
        }

        int highestHunger = hunger;
        Animal leastHungry = new Animal();

        for (Animal animal : farm){
            if (animal.hunger <= highestHunger){
                leastHungry = animal;
                highestHunger = animal.hunger;
            }
        }
        farm.remove(leastHungry);
        slots++;
    }

    public List<Animal> getFarm() {
        return farm;
    }

    public static int getSlots() {
        return slots;
    }
}
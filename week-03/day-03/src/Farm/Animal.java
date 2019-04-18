package Farm;

public class Animal {

    int hunger = 50;
    int thirst = 50;
    String name;

    @Override
    public String toString(){
        return name;
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
    }

    public void eat(){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    public void play(){
        thirst++;
        hunger++;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
}

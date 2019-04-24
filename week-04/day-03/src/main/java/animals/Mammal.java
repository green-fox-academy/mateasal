package animals;

public class Mammal extends Animal {

    public Mammal(String name){
        this.name = name;
    }

    public String breed(){
        return "live-bearing";
    }
}

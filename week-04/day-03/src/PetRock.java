public class PetRock {

    private String name;

    public PetRock(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("woof");
    }

    public String getName() {
        return name;
    }
}

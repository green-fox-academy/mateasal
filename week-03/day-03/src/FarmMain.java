public class FarmMain {

    public static void main(String[] args) {

        Farm myFarm = new Farm(5);

        Animal animal1 = new Animal("tiger");
        Animal animal2 = new Animal("krisz");
        Animal animal3 = new Animal("fish");
        Animal animal4 = new Animal("dog");
        Animal animal5 = new Animal("camel");

        myFarm.breed(animal1);
        myFarm.breed(animal2);
        myFarm.breed(animal3);
        myFarm.breed(animal4);
        myFarm.breed(animal5);

        for (int i = 0; i < 10; i++){
            animal1.eat();
        }

        for (int i = 0; i < 5; i++){
            animal2.eat();
        }

        for (int i = 0; i < 20; i++){
            animal3.eat();
        }

        myFarm.slaughter();

        System.out.println(myFarm.getFarm().toString());
    }
}

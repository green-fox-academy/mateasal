package Sharpies;

public class SharpieTest {

    public static void main(String[] args) {

        SharpeSet mySharpies = new SharpeSet();

        Sharpie redSharpie = new Sharpie("red", 3.2F);
        Sharpie greenSharpie = new Sharpie("green", 3.2F);
        Sharpie purpleSharpie = new Sharpie("purple", 3.2F);
        Sharpie brownSharpie = new Sharpie("brown", 3.2F);
        Sharpie yellowSharpie = new Sharpie("yellow", 3.2F);
        Sharpie pinkSharpie = new Sharpie("pink", 3.2F);

        mySharpies.add(redSharpie);
        mySharpies.add(greenSharpie);
        mySharpies.add(purpleSharpie);
        mySharpies.add(yellowSharpie);
        mySharpies.add(brownSharpie);
        mySharpies.add(pinkSharpie);

        System.out.println("Number of sharpies:");

        System.out.println(mySharpies.getSharpies().size());

        System.out.println("Usable sharpies:");

        System.out.println(mySharpies.countUsable());

        for (int i = 0; i < 100; i++){
            redSharpie.use();
            greenSharpie.use();
            brownSharpie.use();
            pinkSharpie.use();
        }

        System.out.println("Usable sharpies:");

        System.out.println(mySharpies.countUsable());

        System.out.println("Number of sharpies:");

        System.out.println(mySharpies.getSharpies().size());

        mySharpies.removeTrash();

        System.out.println("Number of sharpies");

        System.out.println(mySharpies.getSharpies().size());

        System.out.println("What sharpies do I have");

        System.out.println(mySharpies.getSharpies());
    }
}

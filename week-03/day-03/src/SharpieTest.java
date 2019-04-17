import java.util.List;

public class SharpieTest {

    public static void main(String[] args) {

        SharpeSet mySharpies = new SharpeSet();

        Sharpie redSharpie = new Sharpie("red", 3.2F);
        Sharpie greenSharpie = new Sharpie("green", 3.2F);
        Sharpie purpleSharpie = new Sharpie("purple", 3.2F);
        Sharpie yellowSharpie = new Sharpie("yellow", 3.2F);

        mySharpies.add(redSharpie);
        mySharpies.add(greenSharpie);
        mySharpies.add(purpleSharpie);
        mySharpies.add(yellowSharpie);

        System.out.println(mySharpies.countUsable());

        for (int i = 0; i <= 100; i++){
            redSharpie.use();
            greenSharpie.use();
        }

        System.out.println(mySharpies.countUsable());

        mySharpies.removeTrash();

        System.out.println(mySharpies.getSharpies().size());
    }
}

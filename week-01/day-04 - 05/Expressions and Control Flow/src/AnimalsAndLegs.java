import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chick u have?");

        int chicks = scanner.nextInt();

        System.out.println("How many pigs u have?");

        int pigs = scanner.nextInt();

        int legs = (2 * chicks) + (4 * pigs);

        System.out.println(legs);

    }

}

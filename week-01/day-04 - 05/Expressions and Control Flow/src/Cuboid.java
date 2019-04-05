import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 15.53432;
        double b = 15.32523;
        double c = 20.64253;

        double surfaceArea = (2 * a * b) + ( 2 * a * c) + (2 * b * c);
        double volume = a * b * c;

        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}

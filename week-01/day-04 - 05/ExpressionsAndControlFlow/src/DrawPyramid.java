import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add number!");

        int input = scanner.nextInt();

        for (int a = 0; a < input; a++){

            for (int b = 0; b <= input - a; b++){

                System.out.print(" ");

            }

            for (int c = 0; c <= (2 * a); c++){

                System.out.print("*");
            }

            System.out.println("");

        }

    }

}

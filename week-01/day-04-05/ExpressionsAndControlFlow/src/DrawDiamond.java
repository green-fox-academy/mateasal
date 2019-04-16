import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number!");

        int input = scanner.nextInt();

        for (int row = 0; row <= input / 2; row++) {
            for (int i = 0; i <= (input / 2) - row; i++){
                System.out.print(" ");
            }

            for (int j = 0; j <= row * 2; j++){
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int row2 = 0; row2 <= input / 2; row2++){
            for (int a = 0; a <= row2; a++){
                System.out.print(" ");
            }

            for (int b = 0; b <= 2*((input /2) - row2); b++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

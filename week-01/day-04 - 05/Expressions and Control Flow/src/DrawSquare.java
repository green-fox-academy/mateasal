import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me a number!");

        int input = scanner.nextInt();

        for (int row = 0; row <= input; row++){

            if ((row == 0) || (row == input)) {

                for (int a = 0; a <= input; a++){

                    System.out.print("%");
                }

            } else {

                for (int b = 0; b <= input; b++){

                    if ((b == 0) || (b == input)){

                        System.out.print("%");

                    } else {

                        System.out.print(" ");

                    }

                }

            }

            System.out.println("");

        }

    }

}

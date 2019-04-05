import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number!");

        int input = scanner.nextInt();

        for(int a = 1; a <= input; a++){

            if ((a == 1) || (a == input)) {

                for (int b = 1; b <= input; b += input) {

                    System.out.print("%");
                }

            }

            System.out.println("%");

        }

    }

}

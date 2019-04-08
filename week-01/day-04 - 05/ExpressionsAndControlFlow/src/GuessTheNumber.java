import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);

        int number = 8;

        boolean win = false;

        while (win == false) {

            System.out.println("Give me a number!");

            int userInput = scanner.nextInt();

            if (userInput < number) {

                System.out.println("The stored number is higher!");

            } else if (userInput > number) {

                System.out.println("The stored number is lower!");

            } else {

                win = true;

            }

        }

        System.out.println("You guessed the number!");

    }

}

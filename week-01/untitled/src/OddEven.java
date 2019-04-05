import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Gimme a number! ");

            int userInput = scanner.nextInt();

            if (userInput % 2 == 0) {

                System.out.println(userInput + " is an even number!");

            } else {

                System.out.println(userInput + " is an odd number!");

            }

        }
}

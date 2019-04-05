import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me the distance in kms!");

        int userInput = scanner.nextInt();

        double distanceMiles = userInput * 0.621371;

        System.out.println(distanceMiles);

        // then it converts that value to miles and prints it
    }
}

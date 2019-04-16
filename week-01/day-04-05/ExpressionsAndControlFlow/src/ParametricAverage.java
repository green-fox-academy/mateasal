import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");

        int input = scanner.nextInt();

        int sum = 0;

        int a = 1;

        while (a <= input){

            System.out.println("Give me a number!");

            int input2 = scanner.nextInt();

            sum  += input2;

            a++;

        }

        int ave = sum / input;

        System.out.println("Sum: " + sum);

        System.out.println("Average: " + ave);

    }

}

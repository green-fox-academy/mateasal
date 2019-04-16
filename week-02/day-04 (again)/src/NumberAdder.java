public class NumberAdder {

    public static void main(String[] args) {

        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        int a = 5;

        System.out.println(numberAdder(a));
    }

    public static int numberAdder(int number){
        if (number == 1){
            return 1;
        } else {
            return number + numberAdder(number -1);
        }
    }
}

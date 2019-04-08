public class Summing {

    public static void main(String[] args) {

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        int number = 5;
        System.out.println(sum(number));
    }

    public static int sum(int a){

        int sum = 0;
        for (int i = 0; i <= a; i++){
            sum += i;
            }
        return sum;
        }
    }

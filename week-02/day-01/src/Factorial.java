public class Factorial {

    public static void main(String[] args) {

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        long number = 13;
        System.out.println(factorio(number));
    }

    public static long factorio(long a){
        long fact = 1;
        for (int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
    }
}

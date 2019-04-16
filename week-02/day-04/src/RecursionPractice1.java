public class RecursionPractice1 {
    public static void main(String[] args) {

        System.out.println(factorialWithRecursion(5));
    }

    public static void reduceByOne(int n){
        if( n >= 0){
            reduceByOne(n-1);
        }
        System.out.println("Completed Call: " + n);
    }

    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }
}

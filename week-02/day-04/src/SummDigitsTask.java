public class SummDigitsTask {
    public static void main(String[] args) {

        System.out.println(sumDigits(123));
    }

    public static int sumDigits (int n){
        int sum = 0;
        if (n == 0){
            return sum;
        } else {
            sum = n % 10 + sumDigits(n/10);
            return sum;
        }
    }
}

public class SumDigit {

    public static void main(String[] args) {
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        int a = 123;
        System.out.println(sumDigits(a));
    }

    public static int sumDigits(int n){
        int sum = 0;
        if (n == 1){
            return sum;
        } else {
            sum = n % 10 + sumDigits(n/10);
            return sum;
        }
    }
}
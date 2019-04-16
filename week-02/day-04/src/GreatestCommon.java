import java.util.ArrayList;
import java.util.Arrays;

public class GreatestCommon {
    public static void main(String[] args) {

        int a = 14;
        int b = 35;

        /* int greatestCommon = 0;

        for (int i = 1; i <= b; i++){
            if ((a % i == 0) && (b % i == 0)){
                greatestCommon = i;
            }
        } */

        System.out.println(gcd(a, b));
    }

    public static int gcd (int a, int b){
        if (b == 0){
            return a;
        } else {
            return gcd(b,a % b);
        }
    }
}
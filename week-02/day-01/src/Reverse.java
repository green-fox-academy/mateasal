import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};

        int temp;
        int start = 0;
        int end = aj.length-1;

        while (start < end){
            temp = aj[start];
            aj[start] = aj[end];
            aj[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(aj));
    }
}

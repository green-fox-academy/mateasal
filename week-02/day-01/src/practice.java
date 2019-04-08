import java.util.Arrays;

public class practice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] numberofEvens = countEvens(arr);

        System.out.print(Arrays.toString(numberofEvens));

    }

    public static int[] countEvens(int[] array){
        int[] returnArray = new int[array.length];
        int j = 0;
        for (int i : array){
            if(i % 2 == 0){
                returnArray[j] = i;
                j++;
            }
        }
        return returnArray;
    }

}

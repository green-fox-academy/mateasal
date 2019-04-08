import java.util.Arrays;

public class DiagonalMatrix {

    public static void main(String[] args) {

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;

                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
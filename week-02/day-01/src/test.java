import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] numberArray = new int[10];

        int variable[] = new int[10];

        variable[1] = 2;

        String[] stringArray = {"just", "random", "words"};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 0;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int j = 0; j < numberArray.length; j++){
            System.out.print("| " + j + " ");
        }

        System.out.println("|");

        String[][] multiArray = new String[10][10];

        for(int i = 0; i <multiArray.length; i++){

            for (int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = i + " " + j;
            }

        }

        int f = 0;
        while (f <= 61) {
            System.out.print('-');
            f++;
        }
        System.out.println();

        for (int i = 0; i <multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }

        int h = 0;
        while (h <= 61) {
            System.out.print('-');
            h++;
        }
        System.out.println();

        for(int row : numberArray){
            System.out.print(row);
        }
        System.out.println("\n");

        for(String[] rows : multiArray){
            for(String column : rows){
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
        System.out.println(Arrays.toString(stringArray));

        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);

        char[][] boardGame = new char[10][10];
        for(char[] row : boardGame){
            Arrays.fill(row, '*');
        }

    }
}

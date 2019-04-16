import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {

        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("assets/win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("assets/win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("assets/draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String filename) {

        try {
            Path filePath = Paths.get(filename);
            List<String> tictac = Files.readAllLines(filePath);

            char[][] matrix = new char[3][3];

            for (int row = 0; row < 3; row++){
                for (int column = 0; column < 3; column ++){
                    matrix[row][column] = tictac.get(row).charAt(column);
                }
            }

            for (int i = 0; i < 3; i++){
                if ((matrix[i][0] == matrix[i][1]) && (matrix[i][1] == matrix[i][3])){
                    return "We have a winner!";
                }
            }

            for (int i = 0; i < 3; i++){
                if ((matrix[0][i] == matrix[1][i]) && (matrix[1][i] == matrix[2][i])){
                    return "We have a winner!";
                }
            }

            if ((matrix[0][1] == matrix[1][1]) && (matrix[1][1] == matrix[2][2])){
                return "We have a winner!";
            }

        } catch (Exception e) {
            return "We have a problem.";
        }
    }
}
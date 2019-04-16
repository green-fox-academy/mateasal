import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args){

        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(miracleAligner("assets/my-file.txt"));
    }

    public static int miracleAligner(String filename){

        try{
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            int lineCounter = 0;
            for (String line : lines){
                lineCounter ++;
            }
            return lineCounter;
        } catch (Exception e){
            return 0;
        }
    }
}
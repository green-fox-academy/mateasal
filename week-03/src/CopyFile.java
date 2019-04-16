import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copyContents("assets/old-file.txt", "my-file.txt"));
    }

    public static boolean copyContents (String fileName1, String fileName2){

        try{
            Path filePath1 = Paths.get(fileName1);
            List<String> content1 = Files.readAllLines(filePath1);

            Path filePath2 = Paths.get(fileName2);

            Files.write(filePath2, content1);

            return true;

        } catch (Exception e){
            return false;
        }
    }
}
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {

        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

        Scanner scanner = new Scanner(System.in);

        System.out.println("gimme a word!");
        String word = scanner.nextLine();

        System.out.println("gimme a number!");
        int number = scanner.nextInt();

        lineAdder(word, number, "assets/my-file.txt");
    }

    public static void lineAdder (String word, int number, String pathname){

        List<String> content = new ArrayList<>();
        for (int i = 0; i <= number; i++){
            content.add(word);
        }

        try {
            Path filePath = Paths.get(pathname);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
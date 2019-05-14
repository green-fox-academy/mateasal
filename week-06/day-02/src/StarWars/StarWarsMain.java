package StarWars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StarWarsMain {

  public static void main(String[] args) {

    List<String> swchars = readFile("assets/swcharacters.csv");

//  Print the name of the heaviest character (if the mass is unknown, ignore that character).

    Map<String, Integer> weightList = Arrays.stream(swchars)
          .map(line -> Arrays.stream(line.split(";")))
          .collect(Collectors.toMap(e1 -> e1, e2 -> e2));
  }

  public static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
      System.out.println("File read.");
    } catch (IOException e) {
      System.out.println("No such file exists.");
    }
    return lines;
  }
}

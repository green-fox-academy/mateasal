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

    Map<String, Integer> weightList = swchars.stream()
          .map(line -> line.split(";"))
          .collect(Collectors.toMap(line -> line[0], line -> stringToInteger(line[2])))
          .entrySet()
          .stream()
          .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
          .limit(1)
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    System.out.println(weightList.toString() + '\n');

//  Print the average height of the male characters

    Map<String, List<Integer>> heightList = swchars.stream()
            .map(line -> line.split(";"))
            .collect(Collectors.groupingBy(line -> line[7],
                    Collectors.mapping(line -> stringToInteger(line[1]),
                            Collectors.toList())));

    System.out.println(heightList.toString());

//    int averageMaleHeight = heightList.keySet().stream();

//  Print the average height of the female characters


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

  public static int stringToInteger(String string) {
    int number;
    try {
      number = Integer.parseInt(string);
    } catch (NumberFormatException e) {
      number = 0;
    }
    return number;
  }
}

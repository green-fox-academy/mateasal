package Wikipedia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WikiWordCounter {

  public static void main(String[] args) {

    List<String> wiki = readFile("assets/page.txt");

    Map<String, Integer> mostCommonWords = wiki.stream()
            .flatMap(str -> Arrays.stream(str.split(" ")))
            .filter(word -> !word.equals(""))
            .map(word -> word.replace(".", ""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(str -> 1)))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(100)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    System.out.println(mostCommonWords.toString());
  }


  public static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
      System.out.println("File read.");
    } catch (IOException e) {
      System.out.println("No file found.");
    }
    return lines;
  }
}

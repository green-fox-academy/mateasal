package Fox;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxMain {
  public static void main(String[] args) {

    Fox fox1 = new Fox("Vuk", "red", 6);
    Fox fox2 = new Fox("Csaba", "green", 7);
    Fox fox3 = new Fox("Gyula", "bronze", 1);
    Fox fox4 = new Fox("Tehén", "green", 3);
    Fox fox5 = new Fox("Róka", "gold", 4);

    List<Fox> fleetOfFoxes = Arrays.asList(fox1, fox2, fox3, fox4, fox5);

//  Write a Stream Expression to find the foxes with green color!

    fleetOfFoxes.stream()
            .filter(fox -> fox.color.equals("green"))
            .forEach(fox -> System.out.println(fox.name));

    System.out.println("---------" + '\n');

//  Write a Stream Expression to find the foxes with green color, and age less then 5 years!

    fleetOfFoxes.stream()
            .filter(fox -> fox.color.equals("green") && fox.age < 5)
            .forEach(fox -> System.out.println(fox.name));

    System.out.println("---------" + '\n');

//  Write a Stream Expression to find the frequency of foxes by color!

    Map<String, Integer> frequencyOfColor = fleetOfFoxes.stream()
            .collect(Collectors.groupingBy(fox -> fox.color, Collectors.summingInt(fox -> 1)));

    System.out.println(frequencyOfColor.toString());

  }
}

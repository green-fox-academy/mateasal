import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
  public static void main(String[] args) {

//  1. Write a Stream Expression to get the even numbers from the following list:
    System.out.println("1.");

    List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> evenNumbers = numbers1.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());

    System.out.println(evenNumbers);
    System.out.println('\n');

//  2. Write a Stream Expression to get the squared value of the positive numbers from the following list:
    System.out.println("2.");

    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> squareOfPositiveNumbers = numbers2.stream()
            .filter(number -> number >= 0)
            .map(number -> number *= number)
            .collect(Collectors.toList());

    System.out.println(squareOfPositiveNumbers);
    System.out.println('\n');

//  3. Write a Stream Expression to find which number squared value is more than 20 from the following list:
    System.out.println("3.");

    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);

    List<Integer> numbersWithSquaredValueMoreThan20 = numbers3.stream()
            .filter(number -> (number * number) > 20)
            .collect(Collectors.toList());

    System.out.println(numbersWithSquaredValueMoreThan20);
    System.out.println('\n');

//  4. Write a Stream Expression to get the average value of the odd numbers from the following list:
    System.out.println("4.");

    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers4.stream()
            .filter(number -> number % 2 != 0)
            .mapToInt(number -> number)
            .average()
            .ifPresent(System.out::println);

    System.out.println('\n');

//  5. Write a Stream Expression to get the sum of the odd numbers in the following list:
    System.out.println("5.");

    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int sum = numbers5.stream()
              .filter(number -> number % 2 != 0)
              .mapToInt(number -> number)
              .sum();

    System.out.println(sum);
    System.out.println('\n');

//  6. Write a Stream Expression to find the uppercase characters in a string!
    System.out.println("6.");

    String sentence = "Alea Iacta Est.";

    List<Character> uppercaseCharacters = sentence.chars()
            .filter(Character::isUpperCase)
            .mapToObj(character -> (char) character)
            .collect(Collectors.toList());

    System.out.println(uppercaseCharacters);
    System.out.println('\n');

//  7. Write a Stream Expression to find the strings which starts with a given letter (as parameter),
//  in the following list:
    System.out.println("7.");

    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
            "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    List<String> citiesStartingWithA = cities.stream()
            .filter(city -> city.startsWith("A"))
            .collect(Collectors.toList());

    System.out.println(citiesStartingWithA);
    System.out.println('\n');

//  8. Write a Stream Expression to concatenate a Character list to a string!
    System.out.println("8.");

    List<Character> ceasarCharacters = Arrays.asList('c', 'e', 'a', 's', 'a', 'r');

    String ceasar = ceasarCharacters.stream()
            .map(String::valueOf).collect(Collectors.joining());

    System.out.println(ceasar);
    System.out.println('\n');

//  9. Write a Stream Expression to find the frequency of characters in a given string!
    System.out.println("9.");

    String longWord = "pneumonoultramicroscopicsilicovolcanoconiosis";

    Map<Character, Integer> frequencyOfCharacters = longWord.chars()
            .mapToObj(character -> (char) character)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

    System.out.println(frequencyOfCharacters.toString());
  }
}

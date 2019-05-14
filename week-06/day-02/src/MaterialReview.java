import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaterialReview {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("ab", "be", "ba");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

    List<Integer> filteredNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .skip(1)
            .limit(2)
            .collect(Collectors.toList());
  }
}
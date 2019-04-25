import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map<Character,Integer> getDictionary(String word) {
        Map<Character, Integer> dictionary = new HashMap<>();
        char[] characters = word.toCharArray();

        for (char character : characters) {
            if (!dictionary.containsKey(character)){
                dictionary.put(character, 1);
            } else {
                dictionary.put(character, dictionary.get(character)+1);
            }
        }
        return dictionary;
    }
}

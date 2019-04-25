import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters counting;

    @Test
    public void returningMapWithValueString() {
        counting = new CountLetters();

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('t', 2);
        expected.put('i', 2);
        expected.put('k', 2);
        expected.put('a', 2);

        assertThat(counting.getDictionary("tikitaka"), is(expected));

    }
}
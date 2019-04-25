import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Test
    public void anagramFinder() {
        anagram = new Anagram();

        assertTrue(anagram.anagramFinder("Dormitory", "Dirtyroom"));
    }
}
import java.util.Arrays;

public class Anagram {

    private String word1;
    private String word2;

    public boolean anagramFinder(String word1, String word2) {
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }
}
